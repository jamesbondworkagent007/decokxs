package com.reown.sign.storage.proposal;

import android.database.sqlite.SQLiteException;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Namespace;
import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.model.vo.proposal.ProposalVO;
import com.reown.sign.storage.data.dao.optionalnamespaces.OptionalNamespaceDaoQueries;
import com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries;
import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C56390yDp;
import o.C56424yEw;
import o.Intent;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProposalStorageRepository {
    public final OptionalNamespaceDaoQueries optionalNamespaceDaoQueries;
    public final ProposalDaoQueries proposalDaoQueries;
    public final ProposalNamespaceDaoQueries requiredNamespaceDaoQueries;

    public ProposalStorageRepository(@NotNull ProposalDaoQueries proposalDaoQueries, @NotNull ProposalNamespaceDaoQueries proposalNamespaceDaoQueries, @NotNull OptionalNamespaceDaoQueries optionalNamespaceDaoQueries) {
        Intrinsics.checkNotNullParameter(proposalDaoQueries, "");
        Intrinsics.checkNotNullParameter(proposalNamespaceDaoQueries, "");
        Intrinsics.checkNotNullParameter(optionalNamespaceDaoQueries, "");
        this.proposalDaoQueries = proposalDaoQueries;
        this.requiredNamespaceDaoQueries = proposalNamespaceDaoQueries;
        this.optionalNamespaceDaoQueries = optionalNamespaceDaoQueries;
    }

    public final /* synthetic */ void insertProposal$sign_release(ProposalVO proposalVO) throws SQLiteException {
        Intrinsics.checkNotNullParameter(proposalVO, "");
        ProposalDaoQueries proposalDaoQueries = this.proposalDaoQueries;
        long requestId = proposalVO.getRequestId();
        String value = proposalVO.getPairingTopic().getValue();
        String name = proposalVO.getName();
        String description = proposalVO.getDescription();
        String url = proposalVO.getUrl();
        List<String> icons = proposalVO.getIcons();
        String relayProtocol = proposalVO.getRelayProtocol();
        String relayData = proposalVO.getRelayData();
        String proposerPublicKey = proposalVO.getProposerPublicKey();
        Map<String, String> properties = proposalVO.getProperties();
        String redirect = proposalVO.getRedirect();
        Expiry expiry = proposalVO.getExpiry();
        proposalDaoQueries.insertOrAbortSession(Long.valueOf(requestId), value, name, description, url, icons, relayProtocol, relayData, proposerPublicKey, properties, redirect, expiry != null ? Long.valueOf(expiry.getSeconds()) : null);
        insertRequiredNamespace(proposalVO.getRequiredNamespaces(), proposalVO.getRequestId());
        insertOptionalNamespace(proposalVO.getOptionalNamespaces(), proposalVO.getRequestId());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: RowType */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ ProposalVO getProposalByKey$sign_release(String str) throws SQLiteException {
        Intrinsics.checkNotNullParameter(str, "");
        return (ProposalVO) this.proposalDaoQueries.getProposalByKey(str, new ProposalStorageRepository$getProposalByKey$1(this)).executeAsOne();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: RowType */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ ProposalVO getProposalByTopic$sign_release(String str) throws SQLiteException {
        Intrinsics.checkNotNullParameter(str, "");
        return (ProposalVO) this.proposalDaoQueries.getProposalByPairingTopic(str, new ProposalStorageRepository$getProposalByTopic$1(this)).executeAsOne();
    }

    public final /* synthetic */ Object getProposals$sign_release(Continuation continuation) throws SQLiteException {
        return Intent.EZpvd(this.proposalDaoQueries.getListOfProposalDaos(new ProposalStorageRepository$getProposals$2(this)), continuation);
    }

    public final /* synthetic */ void deleteProposal$sign_release(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new ProposalStorageRepository$deleteProposal$1(this, str, null), 3, null);
    }

    public final ProposalVO mapProposalDaoToProposalVO(long j, String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, Map<String, String> map, String str8, Long l) {
        return new ProposalVO(j, new Topic(str), str2, str3, str4, list, str8, getRequiredNamespaces(j), getOptionalNamespaces(j), map, str7, str5, str6, l != null ? new Expiry(l.longValue()) : null);
    }

    public final Map<String, Namespace.Proposal> getRequiredNamespaces(long j) {
        return C56424yEw.copydefault(this.requiredNamespaceDaoQueries.getProposalNamespaces(j, new yHT<String, List<? extends String>, List<? extends String>, List<? extends String>, Pair<? extends String, ? extends Namespace.Proposal>>() { // from class: com.reown.sign.storage.proposal.ProposalStorageRepository.getRequiredNamespaces.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ Pair<? extends String, ? extends Namespace.Proposal> invoke(String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3) {
                return invoke2(str, (List<String>) list, (List<String>) list2, (List<String>) list3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Pair<String, Namespace.Proposal> invoke2(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                return C56390yDp.OLrzqt(str, new Namespace.Proposal(list2, list, list3));
            }
        }).executeAsList());
    }

    public final Map<String, Namespace.Proposal> getOptionalNamespaces(long j) {
        return C56424yEw.copydefault(this.optionalNamespaceDaoQueries.getOptionalNamespaces(j, new yHT<String, List<? extends String>, List<? extends String>, List<? extends String>, Pair<? extends String, ? extends Namespace.Proposal>>() { // from class: com.reown.sign.storage.proposal.ProposalStorageRepository.getOptionalNamespaces.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ Pair<? extends String, ? extends Namespace.Proposal> invoke(String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3) {
                return invoke2(str, (List<String>) list, (List<String>) list2, (List<String>) list3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Pair<String, Namespace.Proposal> invoke2(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                return C56390yDp.OLrzqt(str, new Namespace.Proposal(list2, list, list3));
            }
        }).executeAsList());
    }

    public final void insertRequiredNamespace(Map<String, Namespace.Proposal> map, long j) throws SQLiteException {
        for (Map.Entry<String, Namespace.Proposal> entry : map.entrySet()) {
            String key = entry.getKey();
            Namespace.Proposal value = entry.getValue();
            this.requiredNamespaceDaoQueries.insertOrAbortProposalNamespace(j, key, value.getChains(), value.getMethods(), value.getEvents());
        }
    }

    public final void insertOptionalNamespace(Map<String, Namespace.Proposal> map, long j) throws SQLiteException {
        if (map != null) {
            for (Map.Entry<String, Namespace.Proposal> entry : map.entrySet()) {
                String key = entry.getKey();
                Namespace.Proposal value = entry.getValue();
                this.optionalNamespaceDaoQueries.insertOrAbortOptionalNamespace(j, key, value.getChains(), value.getMethods(), value.getEvents());
            }
        }
    }
}
