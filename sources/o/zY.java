package o;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zY {
    public static final void AEQbTJ(final C5036Cg c5036Cg, InterfaceC5037Ch interfaceC5037Ch) {
        interfaceC5037Ch.EZpvd().EZpvd(new Function2<java.lang.String, java.util.List<? extends java.lang.String>, Unit>() { // from class: aws.smithy.kotlin.runtime.http.auth.AwsHttpSignerKt$update$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
                invoke2(str, (List<String>) list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str, @NotNull List<String> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                c5036Cg.AEQbTJ().KWHzl(str, (Iterable) list);
            }
        });
        java.util.Iterator it = interfaceC5037Ch.AEQbTJ().copydefault().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C5166Hg c5166Hg = (C5166Hg) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (!c5036Cg.djBIcL().EZpvd().containsKey(c5166Hg)) {
                c5036Cg.djBIcL().EZpvd().copydefault(c5166Hg, (java.util.Collection<C5166Hg>) list);
            }
        }
    }
}
