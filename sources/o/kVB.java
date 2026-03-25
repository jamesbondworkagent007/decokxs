package o;

import com.okinc.business.dexlogic.bean.SaveIntentOrderData;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVB implements kVE {
    public final InterfaceC23234huQ copydefault;

    @yCM
    public kVB(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.copydefault = interfaceC23234huQ;
    }

    @Override // o.kVE
    public AbstractC58185ywX<ResponseData<SaveIntentData>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33024moe.KWHzl((AbstractC58185ywX) this.copydefault.copydefault(new SaveIntentOrderData(str2, str, str3, str4, i, java.lang.Integer.valueOf(i2))));
    }
}
