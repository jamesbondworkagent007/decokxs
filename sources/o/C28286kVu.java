package o;

import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28286kVu implements InterfaceC28283kVr {
    public static final ActionBar Companion = new ActionBar(null);
    public static final java.util.List<java.lang.String> copydefault = yDY.gEmmrt("0.1", SlippageConfigVo.MAX_SLIP, "1");
    public static final java.util.List<java.lang.String> EZpvd = yDY.gEmmrt("0.25", SlippageConfigVo.MAX_SLIP, "1");

    /* JADX INFO: renamed from: o.kVu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kVu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.util.List<java.lang.String> copydefault() {
            return C28286kVu.copydefault;
        }

        public final java.util.List<java.lang.String> OLrzqt() {
            return C28286kVu.EZpvd;
        }
    }

    @Override // o.InterfaceC28283kVr
    public java.util.List<java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23317hvu.KWHzl(str, str2);
    }

    @Override // o.InterfaceC28283kVr
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        C23317hvu.copydefault(str, str2, list);
    }

    @Override // o.InterfaceC28283kVr
    public java.util.List<java.lang.String> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23317hvu.AEQbTJ(str);
    }

    @Override // o.InterfaceC28283kVr
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        C23317hvu.KWHzl(str, list);
    }

    @Override // o.InterfaceC28283kVr
    public int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23317hvu.AEQbTJ(str, str2);
    }

    @Override // o.InterfaceC28283kVr
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C23317hvu.EZpvd(str, str2, i);
    }

    @Override // o.InterfaceC28283kVr
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C23317hvu.gEmmrt(str, str2);
    }

    @Override // o.InterfaceC28283kVr
    public java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23317hvu.OLrzqt(str);
    }
}
