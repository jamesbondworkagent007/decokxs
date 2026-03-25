package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58725zN;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AY implements InterfaceC58725zN {
    public final boolean EZpvd;
    public final Headers KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56482yH
    public boolean KWHzl() {
        return this.EZpvd;
    }

    public AY(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "");
        this.KWHzl = headers;
        this.EZpvd = true;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.InterfaceC56482yH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        return InterfaceC58725zN.TaskDescription.AEQbTJ(this, str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit>] */
    @Override // o.InterfaceC56482yH
    public void EZpvd(@NotNull Function2<? super java.lang.String, ? super java.util.List<? extends java.lang.String>, Unit> function2) {
        InterfaceC58725zN.TaskDescription.EZpvd(this, function2);
    }

    @Override // o.InterfaceC56482yH
    public java.util.List<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<java.lang.String> listValues = this.KWHzl.values(str);
        if (listValues.isEmpty()) {
            return null;
        }
        return listValues;
    }

    @Override // o.InterfaceC56482yH
    public java.util.Set<java.lang.String> OLrzqt() {
        return this.KWHzl.names();
    }

    @Override // o.InterfaceC56482yH
    public java.util.Set<Map.Entry<java.lang.String, java.util.List<java.lang.String>>> AEQbTJ() {
        return this.KWHzl.toMultimap().entrySet();
    }

    @Override // o.InterfaceC56482yH
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.get(str) != null;
    }

    @Override // o.InterfaceC56482yH
    public boolean EZpvd() {
        return this.KWHzl.size() == 0;
    }
}
