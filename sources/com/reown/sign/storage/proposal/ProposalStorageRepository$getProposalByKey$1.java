package com.reown.sign.storage.proposal;

import com.reown.sign.common.model.vo.proposal.ProposalVO;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.yHD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class ProposalStorageRepository$getProposalByKey$1 extends FunctionReferenceImpl implements yHD<Long, String, String, String, String, List<? extends String>, String, String, String, Map<String, ? extends String>, String, Long, ProposalVO> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProposalStorageRepository$getProposalByKey$1(Object obj) {
        super(12, obj, ProposalStorageRepository.class, "mapProposalDaoToProposalVO", "mapProposalDaoToProposalVO(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)Lcom/reown/sign/common/model/vo/proposal/ProposalVO;", 0);
    }

    public final ProposalVO invoke(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, String str6, @NotNull String str7, Map<String, String> map, @NotNull String str8, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return ((ProposalStorageRepository) this.receiver).mapProposalDaoToProposalVO(j, str, str2, str3, str4, list, str5, str6, str7, map, str8, l);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.yHD
    public /* synthetic */ ProposalVO invoke(Long l, String str, String str2, String str3, String str4, List<? extends String> list, String str5, String str6, String str7, Map<String, ? extends String> map, String str8, Long l2) {
        return invoke(l.longValue(), str, str2, str3, str4, (List<String>) list, str5, str6, str7, (Map<String, String>) map, str8, l2);
    }
}
