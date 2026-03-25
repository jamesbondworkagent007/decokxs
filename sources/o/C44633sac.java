package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.rXV;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.sac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44633sac implements InterfaceC46949tgn {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final rYT AEQbTJ;
    public final android.content.Context EZpvd;
    public final rYO KWHzl;
    public final InterfaceC44628saX OLrzqt;

    @yCM
    public C44633sac(@NotNull android.content.Context context, @NotNull InterfaceC44628saX interfaceC44628saX, @NotNull rYT ryt, @NotNull rYO ryo) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC44628saX, "");
        Intrinsics.checkNotNullParameter(ryt, "");
        Intrinsics.checkNotNullParameter(ryo, "");
        this.EZpvd = context;
        this.OLrzqt = interfaceC44628saX;
        this.AEQbTJ = ryt;
        this.KWHzl = ryo;
    }

    @Override // o.InterfaceC46949tgn
    public C46953tgr OLrzqt() {
        return new C46953tgr(true);
    }

    @Override // o.InterfaceC46949tgn
    public void copydefault(@NotNull final C46952tgq c46952tgq) {
        Intrinsics.checkNotNullParameter(c46952tgq, "");
        this.OLrzqt.KWHzl();
        if (C32986mnt.EZpvd.valueOf()) {
            if (EZpvd(c46952tgq)) {
                try {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.sab
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C44633sac.OLrzqt(this.AEQbTJ, c46952tgq);
                        }
                    });
                    return;
                } catch (java.lang.Exception e) {
                    pUU.copydefault("InappPushListener", "handleNotication, inapp error: " + e.getMessage());
                    OLrzqt(c46952tgq);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
            }
            pUU.KWHzl("InappPushListener", "handleNotication, payload don't have inapp, show system notification");
            OLrzqt(c46952tgq);
            return;
        }
        pUU.KWHzl("InappPushListener", "handleNotication, app in background, show system notification");
        OLrzqt(c46952tgq);
    }

    public static final void OLrzqt(C44633sac c44633sac, C46952tgq c46952tgq) {
        pUU.KWHzl("InappPushListener", "handleNotication, payload have inapp, show inapp banner");
        rYO ryo = c44633sac.KWHzl;
        java.lang.String strGEmmrt = c46952tgq.gEmmrt();
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        java.lang.String strOLrzqt = c46952tgq.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        java.lang.String strCopydefault = c46952tgq.copydefault();
        ryo.OLrzqt(strGEmmrt, strOLrzqt, strCopydefault != null ? strCopydefault : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(C46952tgq c46952tgq) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.lang.String strKWHzl = c46952tgq.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            JSONObject jSONObjectOptJSONObject = new JSONObject(new JSONObject(strKWHzl).optString("custom")).optJSONObject(IEncryptorType.DEFAULT_ENCRYPTOR);
            if (jSONObjectOptJSONObject != null) {
                boolean z = true;
                if (jSONObjectOptJSONObject.optInt("inapp") != 1) {
                    z = false;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(z));
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    public final void OLrzqt(C46952tgq c46952tgq) {
        rYT ryt = this.AEQbTJ;
        java.lang.String string = this.EZpvd.getString(rXV.TaskDescription.fJNWhG);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iCurrentTimeMillis = (int) java.lang.System.currentTimeMillis();
        java.lang.String strGEmmrt = c46952tgq.gEmmrt();
        java.lang.String str = strGEmmrt == null ? "" : strGEmmrt;
        java.lang.String strOLrzqt = c46952tgq.OLrzqt();
        java.lang.String str2 = strOLrzqt == null ? "" : strOLrzqt;
        java.lang.String strCopydefault = c46952tgq.copydefault();
        ryt.copydefault("oke_notification_channel", string, iCurrentTimeMillis, null, str, str2, false, (128 & 128) != 0 ? null : null, strCopydefault == null ? "" : strCopydefault, false, false);
    }

    /* JADX INFO: renamed from: o.sac$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sac.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
