package o;

import com.okinc.captcha.impl.data.CaptchaVendor;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30371lVx {
    public final C30373lVz copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final CaptchaVendor EZpvd = CaptchaVendor.GEETEST;

    @yCM
    public C30371lVx(@NotNull C30373lVz c30373lVz) {
        Intrinsics.checkNotNullParameter(c30373lVz, "");
        this.copydefault = c30373lVz;
    }

    public final CaptchaVendor AEQbTJ() {
        CaptchaVendor captchaVendor = (CaptchaVendor) CollectionsKt___CollectionsKt.firstOrNull(this.copydefault.KWHzl());
        return captchaVendor == null ? EZpvd : captchaVendor;
    }

    public final void copydefault() {
        CaptchaVendor captchaVendorAEQbTJ = AEQbTJ();
        java.util.List<CaptchaVendor> listKWHzl = this.copydefault.KWHzl();
        java.util.Iterator<CaptchaVendor> it = listKWHzl.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getValue(), (java.lang.Object) captchaVendorAEQbTJ.getValue())) {
                break;
            } else {
                i++;
            }
        }
        if (((CaptchaVendor) CollectionsKt___CollectionsKt.AkhnZx(listKWHzl, i + 1)) != null) {
            EZpvd();
        }
    }

    public final void EZpvd() {
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) this.copydefault.KWHzl());
        listFJNWhG.add((CaptchaVendor) listFJNWhG.remove(0));
        java.util.List<? extends CaptchaVendor> listQbewEr = CollectionsKt___CollectionsKt.QbewEr(listFJNWhG);
        C30373lVz.copydefault.AEQbTJ(listQbewEr);
        pUU.KWHzl("CaptchaService", "update captcha vendor to " + listQbewEr.get(0).getValue());
    }

    /* JADX INFO: renamed from: o.lVx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lVx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
