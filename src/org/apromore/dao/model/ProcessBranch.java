package org.apromore.dao.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * ProcessBranch generated by hbm2java
 */
@Entity
@Table(name = "process_branch")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Configurable("processBranch")
public class ProcessBranch implements Serializable {

    /**
     * Hard coded for interoperability.
     */
    private static final long serialVersionUID = -9072538404478485548L;

    private Integer branchId;
    private String branchName;
    private String creationDate;
    private String lastUpdate;
    private String ranking;

    private Process process;
    private ProcessModelVersion processModelVersionsByCurrentProcessModelVersionId;
    private ProcessModelVersion processModelVersionsBySourceProcessModelVersionId;
    private Set<ProcessModelVersion> processModelVersions = new HashSet<ProcessModelVersion>(0);


    public ProcessBranch() { }


    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "branch_id", unique = true, nullable = false, length = 40)
    public Integer getBranchId() {
        return this.branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "current_process_model_version_id")
    public ProcessModelVersion getProcessModelVersionsByCurrentProcessModelVersionId() {
        return this.processModelVersionsByCurrentProcessModelVersionId;
    }

    public void setProcessModelVersionsByCurrentProcessModelVersionId(ProcessModelVersion processModelVersionsByCurrentProcessModelVersionId) {
        this.processModelVersionsByCurrentProcessModelVersionId = processModelVersionsByCurrentProcessModelVersionId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_process_model_version_id")
    public ProcessModelVersion getProcessModelVersionsBySourceProcessModelVersionId() {
        return this.processModelVersionsBySourceProcessModelVersionId;
    }

    public void setProcessModelVersionsBySourceProcessModelVersionId(ProcessModelVersion processModelVersionsBySourceProcessModelVersionId) {
        this.processModelVersionsBySourceProcessModelVersionId = processModelVersionsBySourceProcessModelVersionId;
    }


    @Column(name = "branch_name", length = 1000)
    public String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(final String newBranchName) {
        this.branchName = newBranchName;
    }

    /**
     * Get the process for the Object.
     * @return Returns the process.
     */
    @Column(name = "creation_date", length = 35)
    public String getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(final String newCreationDate) {
        this.creationDate = newCreationDate;
    }

    /**
     * Get the process for the Object.
     * @return Returns the process.
     */
    @Column(name = "last_update", length = 35)
    public String getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(final String newLastUpdate) {
        this.lastUpdate = newLastUpdate;
    }

    /**
     * Get the process for the Object.
     * @return Returns the process.
     */
    @Column(name = "ranking", length = 10)
    public String getRanking() {
        return this.ranking;
    }

    public void setRanking(final String newRanking) {
        this.ranking = newRanking;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "process_id")
    public Process getProcess() {
        return this.process;
    }

    public void setProcess(final Process newProcess) {
        this.process = newProcess;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "processBranch")
    public Set<ProcessModelVersion> getProcessModelVersions() {
        return this.processModelVersions;
    }

    public void setProcessModelVersions(final Set<ProcessModelVersion> newProcessModelVersions) {
        this.processModelVersions = newProcessModelVersions;
    }

}


