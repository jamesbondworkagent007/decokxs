package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.utM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49690utM implements InterfaceC49583urL {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [24=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.InterfaceC49583urL
    public InterfaceC49582urK AEQbTJ(@NotNull android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (instType == null) {
            return null;
        }
        switch (instType.hashCode()) {
            case -2027980370:
                if (instType.equals("MARGIN")) {
                    return new C49701utX(context, null, 0, bizInstrument, z, interfaceC49574urC, 6, null);
                }
                return null;
            case 2552066:
                if (instType.equals("SPOT")) {
                    return new C49697utT(context, null, 0, bizInstrument, z, interfaceC49574urC, 6, null);
                }
                return null;
            case 2558355:
                if (instType.equals("SWAP")) {
                    return new C49757uua(context, null, 0, fragmentManager, bizInstrument, z, interfaceC49574urC, 6, null);
                }
                return null;
            case 214415088:
                if (instType.equals("FUTURES")) {
                    return new C49687utJ(context, null, 0, bizInstrument, z, interfaceC49574urC, 6, null);
                }
                return null;
            default:
                return null;
        }
    }
}
