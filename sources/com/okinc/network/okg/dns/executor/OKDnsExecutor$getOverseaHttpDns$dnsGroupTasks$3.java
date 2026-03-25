package com.okinc.network.okg.dns.executor;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C43326rnF;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OKDnsExecutor$getOverseaHttpDns$dnsGroupTasks$3 extends FunctionReferenceImpl implements Function1<String, String> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKDnsExecutor$getOverseaHttpDns$dnsGroupTasks$3(Object obj) {
        super(1, obj, C43326rnF.class, "queryDNSFromCloudFlare", "queryDNSFromCloudFlare(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((C43326rnF) this.receiver).AhwBna(str);
    }
}
