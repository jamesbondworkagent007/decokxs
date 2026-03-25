package o;

import androidx.appcompat.content.res.AppCompatResources;
import com.okinc.share.bean.FootViewData;
import com.okinc.share.bean.ShareBizCondition;
import com.okinc.share.bean.ShareData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48894ueL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49008ugT implements InterfaceC49001ugM {
    public static final Activity Companion = new Activity(null);
    public static final java.lang.String OLrzqt = "https://okx.com/download";
    public static final java.lang.String EZpvd = "https://tr.okx.com/download";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49001ugM
    public void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49001ugM
    public boolean OLrzqt(@NotNull C48984ufw c48984ufw) {
        Intrinsics.checkNotNullParameter(c48984ufw, "");
        return true;
    }

    /* JADX INFO: renamed from: o.ugT$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ugT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC49001ugM
    public ShareData AkhnZx() {
        return new ShareData(OLrzqt(), null);
    }

    public final FootViewData OLrzqt() {
        android.graphics.drawable.Drawable drawable;
        android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
        if (C34703nhO.AEQbTJ()) {
            drawable = AppCompatResources.getDrawable(applicationOLrzqt, C48894ueL.ActionBar.wlaJM);
        } else {
            drawable = AppCompatResources.getDrawable(applicationOLrzqt, C48894ueL.ActionBar.uzCIH);
        }
        int color = applicationOLrzqt.getResources().getColor(C52761wXj.Activity.htlTjW);
        if (drawable != null) {
            drawable.setTint(color);
        }
        java.lang.String strOLrzqt = C34703nhO.OLrzqt(applicationOLrzqt);
        android.content.res.Resources resources = applicationOLrzqt.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        java.lang.String strCopydefault = C33069mpW.copydefault(resources, C48894ueL.StateListAnimator.KWHzl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(new kotlin.Pair("platformName", strOLrzqt)));
        java.lang.String str = C34703nhO.AEQbTJ() ? EZpvd : OLrzqt;
        return new FootViewData(strCopydefault, C49292ulm.EZpvd.KWHzl(str), str, drawable);
    }

    @Override // o.InterfaceC49001ugM
    public ShareBizCondition values() {
        return new ShareBizCondition(false, false);
    }
}
