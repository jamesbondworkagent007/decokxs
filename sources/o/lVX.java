package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.captcha.impl.data.CaptchaScene;
import com.okinc.captcha.impl.data.CaptchaVendor;
import com.okinc.captcha.impl.data.RecaptchaActionScene;
import com.okinc.captcha.impl.service.AdaptiveCaptchaService$startCaptcha$1;
import com.okinc.captcha.impl.service.AdaptiveCaptchaService$startCaptchaWithFallback$1;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC30369lVv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lVX extends AbstractC43215rlA implements lWe {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final lWs AEQbTJ;
    public final lVC KWHzl;
    public final lVV OLrzqt;
    public final C30371lVx copydefault;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CaptchaVendor.values().length];
            try {
                iArr[CaptchaVendor.GEETEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CaptchaVendor.TCAPTCHA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CaptchaVendor.RECAPTCHA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public lVX(@NotNull C30371lVx c30371lVx, @NotNull lVC lvc, @NotNull lWs lws, @NotNull lVV lvv) {
        Intrinsics.checkNotNullParameter(c30371lVx, "");
        Intrinsics.checkNotNullParameter(lvc, "");
        Intrinsics.checkNotNullParameter(lws, "");
        Intrinsics.checkNotNullParameter(lvv, "");
        this.copydefault = c30371lVx;
        this.KWHzl = lvc;
        this.AEQbTJ = lws;
        this.OLrzqt = lvv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.lWe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull CaptchaScene captchaScene, @NotNull java.lang.String str, CaptchaVendor captchaVendor, java.lang.String str2, java.lang.String str3, @NotNull SubdomainStrategy subdomainStrategy, Function1<? super EventParamsList, Unit> function1, Function1<? super EventParamsList, Unit> function12, Function1<? super java.lang.Boolean, Unit> function13, boolean z, RecaptchaActionScene recaptchaActionScene, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC30369lVv> continuation) throws java.lang.Throwable {
        AdaptiveCaptchaService$startCaptcha$1 adaptiveCaptchaService$startCaptcha$1;
        if (continuation instanceof AdaptiveCaptchaService$startCaptcha$1) {
            adaptiveCaptchaService$startCaptcha$1 = (AdaptiveCaptchaService$startCaptcha$1) continuation;
            int i = adaptiveCaptchaService$startCaptcha$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adaptiveCaptchaService$startCaptcha$1.label = i - Integer.MIN_VALUE;
            } else {
                adaptiveCaptchaService$startCaptcha$1 = new AdaptiveCaptchaService$startCaptcha$1(this, continuation);
            }
        }
        java.lang.Object obj = adaptiveCaptchaService$startCaptcha$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adaptiveCaptchaService$startCaptcha$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return obj;
            }
            C56391yDq.AEQbTJ(obj);
            if (captchaVendor != null) {
                adaptiveCaptchaService$startCaptcha$1.label = 1;
                java.lang.Object objStartCaptchaWithVendor$default = startCaptchaWithVendor$default(this, fragmentActivity, captchaScene, str, captchaVendor, str2, str3, subdomainStrategy, function1, function12, function13, z, recaptchaActionScene, null, adaptiveCaptchaService$startCaptcha$1, 4096, null);
                return objStartCaptchaWithVendor$default == objCopydefault ? objCopydefault : objStartCaptchaWithVendor$default;
            }
            adaptiveCaptchaService$startCaptcha$1.label = 2;
            java.lang.Object objKWHzl = KWHzl(fragmentActivity, captchaScene, str, str2, str3, subdomainStrategy, function1, function12, function13, z, recaptchaActionScene, bool, adaptiveCaptchaService$startCaptcha$1);
            return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.KWHzl("CaptchaService", "unexpected error when start captcha, error=" + th.getMessage());
            return new AbstractC30369lVv.TaskDescription(th.getMessage(), false, 2, null);
        }
    }

    public static /* synthetic */ java.lang.Object startCaptchaWithVendor$default(lVX lvx, FragmentActivity fragmentActivity, CaptchaScene captchaScene, java.lang.String str, CaptchaVendor captchaVendor, java.lang.String str2, java.lang.String str3, SubdomainStrategy subdomainStrategy, Function1 function1, Function1 function12, Function1 function13, boolean z, RecaptchaActionScene recaptchaActionScene, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
        return lvx.EZpvd(fragmentActivity, captchaScene, str, captchaVendor, str2, str3, subdomainStrategy, function1, function12, function13, z, (i & 2048) != 0 ? null : recaptchaActionScene, (i & 4096) != 0 ? java.lang.Boolean.FALSE : bool, continuation);
    }

    public final java.lang.Object EZpvd(FragmentActivity fragmentActivity, CaptchaScene captchaScene, java.lang.String str, CaptchaVendor captchaVendor, java.lang.String str2, java.lang.String str3, SubdomainStrategy subdomainStrategy, Function1<? super EventParamsList, Unit> function1, Function1<? super EventParamsList, Unit> function12, Function1<? super java.lang.Boolean, Unit> function13, boolean z, RecaptchaActionScene recaptchaActionScene, java.lang.Boolean bool, Continuation<? super AbstractC30369lVv> continuation) {
        pUU.KWHzl("CaptchaService", "the " + str + " page starts " + captchaVendor + " captcha.");
        int i = Activity.OLrzqt[captchaVendor.ordinal()];
        if (i == 1) {
            return this.KWHzl.KWHzl(fragmentActivity, captchaScene, str, str2, str3, subdomainStrategy, function1, function12, function13, z, continuation);
        }
        if (i == 2) {
            return this.AEQbTJ.AEQbTJ(fragmentActivity, captchaScene, str, function1, function12, function13, z, continuation);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return this.OLrzqt.copydefault(fragmentActivity, Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)), str, recaptchaActionScene, function1, function12, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(FragmentActivity fragmentActivity, CaptchaScene captchaScene, java.lang.String str, java.lang.String str2, java.lang.String str3, SubdomainStrategy subdomainStrategy, Function1<? super EventParamsList, Unit> function1, Function1<? super EventParamsList, Unit> function12, Function1<? super java.lang.Boolean, Unit> function13, boolean z, RecaptchaActionScene recaptchaActionScene, java.lang.Boolean bool, Continuation<? super AbstractC30369lVv> continuation) throws java.lang.Throwable {
        AdaptiveCaptchaService$startCaptchaWithFallback$1 adaptiveCaptchaService$startCaptchaWithFallback$1;
        lVX lvx;
        CaptchaVendor captchaVendor;
        if (continuation instanceof AdaptiveCaptchaService$startCaptchaWithFallback$1) {
            adaptiveCaptchaService$startCaptchaWithFallback$1 = (AdaptiveCaptchaService$startCaptchaWithFallback$1) continuation;
            int i = adaptiveCaptchaService$startCaptchaWithFallback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adaptiveCaptchaService$startCaptchaWithFallback$1.label = i - Integer.MIN_VALUE;
            } else {
                adaptiveCaptchaService$startCaptchaWithFallback$1 = new AdaptiveCaptchaService$startCaptchaWithFallback$1(this, continuation);
            }
        }
        AdaptiveCaptchaService$startCaptchaWithFallback$1 adaptiveCaptchaService$startCaptchaWithFallback$12 = adaptiveCaptchaService$startCaptchaWithFallback$1;
        java.lang.Object objEZpvd = adaptiveCaptchaService$startCaptchaWithFallback$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adaptiveCaptchaService$startCaptchaWithFallback$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            CaptchaVendor captchaVendorAEQbTJ = this.copydefault.AEQbTJ();
            adaptiveCaptchaService$startCaptchaWithFallback$12.L$0 = this;
            adaptiveCaptchaService$startCaptchaWithFallback$12.L$1 = captchaVendorAEQbTJ;
            adaptiveCaptchaService$startCaptchaWithFallback$12.label = 1;
            objEZpvd = EZpvd(fragmentActivity, captchaScene, str, captchaVendorAEQbTJ, str2, str3, subdomainStrategy, function1, function12, function13, z, recaptchaActionScene, bool, adaptiveCaptchaService$startCaptchaWithFallback$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            lvx = this;
            captchaVendor = captchaVendorAEQbTJ;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            captchaVendor = (CaptchaVendor) adaptiveCaptchaService$startCaptchaWithFallback$12.L$1;
            lvx = (lVX) adaptiveCaptchaService$startCaptchaWithFallback$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC30369lVv abstractC30369lVv = (AbstractC30369lVv) objEZpvd;
        if ((abstractC30369lVv instanceof AbstractC30369lVv.TaskDescription) && !((AbstractC30369lVv.TaskDescription) abstractC30369lVv).AEQbTJ()) {
            pUU.KWHzl("CaptchaService", "the captcha vendor " + captchaVendor + " encounters error, fallback to next vendor.");
            lvx.copydefault.copydefault();
        }
        return abstractC30369lVv;
    }

    @Override // o.lWe
    public void KWHzl(@NotNull java.util.List<? extends CaptchaVendor> list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("CaptchaService", "captcha vendor config: " + list);
        C30373lVz.copydefault.AEQbTJ(list);
        boolean zValues = ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB().values();
        lWv lwv = lWv.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CaptchaVendor) it.next()).name());
        }
        lwv.KWHzl(arrayList, zValues);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lVX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
