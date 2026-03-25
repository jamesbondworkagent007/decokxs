package o;

import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.wallet.mine.scan.bean.MpcQRCodeParseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fqJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18853fqJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static java.lang.String copydefault = "";
    public static java.lang.String KWHzl = "";

    /* JADX INFO: renamed from: o.fqJ$Application */
    public static final class Application extends TypeToken<MpcQRCodeParseBean> {
    }

    /* JADX INFO: renamed from: o.fqJ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fqJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String EZpvd() {
            return C18853fqJ.copydefault;
        }

        public final void KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18853fqJ.copydefault = str;
        }

        public final java.lang.String OLrzqt() {
            return C18853fqJ.KWHzl;
        }

        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C18853fqJ.KWHzl = str;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dpH.getGson$default(android.content.Context, int, java.lang.Object):com.google.gson.Gson */
    public final MpcQRCodeParseBean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C59449zhJ.startsWith$default(str, "okx_mpc:", false, 2, null)) {
            return null;
        }
        try {
            java.lang.String strEZpvd = xXW.OLrzqt.EZpvd(C59449zhJ.replace$default(str, "okx_mpc:", "", false, 4, (java.lang.Object) null), copydefault);
            if (C59449zhJ.startsWith$default(strEZpvd, "{", false, 2, null)) {
                return (MpcQRCodeParseBean) C14637dpH.getGson$default(null, 1, null).fromJson(strEZpvd, new Application().getType());
            }
            return null;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
