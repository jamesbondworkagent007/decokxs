package o;

import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.http.HttpBodyKt$readAll$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC59439zh;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58752zO {
    public static final zP copydefault(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return zP.EZpvd.OLrzqt(bArr);
    }

    public static final zP EZpvd(@NotNull AbstractC59439zh abstractC59439zh) {
        Intrinsics.checkNotNullParameter(abstractC59439zh, "");
        if (abstractC59439zh instanceof AbstractC59439zh.Application) {
            return new C58374zA((AbstractC59439zh.Application) abstractC59439zh);
        }
        if (abstractC59439zh instanceof AbstractC59439zh.Activity) {
            return new C58455zD((AbstractC59439zh.Activity) abstractC59439zh);
        }
        if (abstractC59439zh instanceof AbstractC59439zh.StateListAnimator) {
            return new C58590zI((AbstractC59439zh.StateListAnimator) abstractC59439zh);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ zP toHttpBody$default(CS cs, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return KWHzl(cs, l);
    }

    /* JADX INFO: renamed from: o.zO$Activity */
    public static final class Activity extends zP.Activity {
        public final /* synthetic */ CS AEQbTJ;
        public final boolean KWHzl = true;
        public final java.lang.Long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP
        public java.lang.Long AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP
        public boolean b_() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP.Activity
        public CS copydefault() {
            return this.AEQbTJ;
        }

        public Activity(java.lang.Long l, CS cs) {
            this.AEQbTJ = cs;
            this.OLrzqt = l;
        }
    }

    public static final zP KWHzl(@NotNull CS cs, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(cs, "");
        return new Activity(l, cs);
    }

    /* JADX INFO: renamed from: o.zO$ActionBar */
    public static final class ActionBar extends zP.Application {
        public final boolean AEQbTJ = true;
        public final /* synthetic */ InterfaceC5060De KWHzl;
        public final java.lang.Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP
        public java.lang.Long AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP
        public boolean b_() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.zP.Application
        public InterfaceC5060De copydefault() {
            return this.KWHzl;
        }

        public ActionBar(java.lang.Long l, InterfaceC5060De interfaceC5060De) {
            this.KWHzl = interfaceC5060De;
            this.copydefault = l;
        }
    }

    public static /* synthetic */ zP toHttpBody$default(InterfaceC5060De interfaceC5060De, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return OLrzqt(interfaceC5060De, l);
    }

    public static final zP OLrzqt(@NotNull InterfaceC5060De interfaceC5060De, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        return new ActionBar(l, interfaceC5060De);
    }

    public static final zP copydefault(@NotNull zP zPVar, @NotNull InterfaceC59908zr interfaceC59908zr, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(zPVar, "");
        Intrinsics.checkNotNullParameter(interfaceC59908zr, "");
        if (zPVar instanceof zP.Application) {
            return OLrzqt(new CM(interfaceC59908zr, ((zP.Application) zPVar).copydefault()), l);
        }
        if (zPVar instanceof zP.Activity) {
            return KWHzl(new CE(interfaceC59908zr, ((zP.Activity) zPVar).copydefault()), l);
        }
        throw new ClientException("HttpBody type is not supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull zP zPVar, @NotNull Continuation<? super byte[]> continuation) {
        HttpBodyKt$readAll$1 httpBodyKt$readAll$1;
        if (continuation instanceof HttpBodyKt$readAll$1) {
            httpBodyKt$readAll$1 = (HttpBodyKt$readAll$1) continuation;
            int i = httpBodyKt$readAll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpBodyKt$readAll$1.label = i - Integer.MIN_VALUE;
            } else {
                httpBodyKt$readAll$1 = new HttpBodyKt$readAll$1(continuation);
            }
        }
        java.lang.Object objKWHzl = httpBodyKt$readAll$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = httpBodyKt$readAll$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objKWHzl);
                return ((CQ) objKWHzl).KWHzl();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
            return (byte[]) objKWHzl;
        }
        C56391yDq.AEQbTJ(objKWHzl);
        if (zPVar instanceof zP.StateListAnimator) {
            return null;
        }
        if (zPVar instanceof zP.TaskDescription) {
            return ((zP.TaskDescription) zPVar).OLrzqt();
        }
        if (zPVar instanceof zP.Activity) {
            CS csCopydefault = ((zP.Activity) zPVar).copydefault();
            httpBodyKt$readAll$1.label = 1;
            objKWHzl = CV.copydefault(csCopydefault, httpBodyKt$readAll$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            return ((CQ) objKWHzl).KWHzl();
        }
        if (!(zPVar instanceof zP.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC5060De interfaceC5060DeCopydefault = ((zP.Application) zPVar).copydefault();
        httpBodyKt$readAll$1.label = 2;
        objKWHzl = C5062Dg.KWHzl(interfaceC5060DeCopydefault, httpBodyKt$readAll$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        return (byte[]) objKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.zP */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC59439zh KWHzl(@NotNull zP zPVar) {
        AbstractC59439zh application;
        Intrinsics.checkNotNullParameter(zPVar, "");
        if (zPVar instanceof InterfaceC58563zH) {
            return ((InterfaceC58563zH) zPVar).EZpvd();
        }
        if (zPVar instanceof zP.StateListAnimator) {
            return null;
        }
        if (zPVar instanceof zP.TaskDescription) {
            application = new TaskDescription(zPVar);
        } else if (zPVar instanceof zP.Activity) {
            application = new StateListAnimator(zPVar);
        } else {
            if (!(zPVar instanceof zP.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            application = new Application(zPVar);
        }
        return application;
    }

    /* JADX INFO: renamed from: o.zO$TaskDescription */
    public static final class TaskDescription extends AbstractC59439zh.Application {
        public final java.lang.Long AEQbTJ;
        public final /* synthetic */ zP OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public java.lang.Long OLrzqt() {
            return this.AEQbTJ;
        }

        public TaskDescription(zP zPVar) {
            this.OLrzqt = zPVar;
            this.AEQbTJ = zPVar.AEQbTJ();
        }

        @Override // o.AbstractC59439zh.Application
        public byte[] EZpvd() {
            return ((zP.TaskDescription) this.OLrzqt).OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.zO$StateListAnimator */
    public static final class StateListAnimator extends AbstractC59439zh.Activity {
        public final java.lang.Long AEQbTJ;
        public final /* synthetic */ zP OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public java.lang.Long OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public boolean copydefault() {
            return this.copydefault;
        }

        public StateListAnimator(zP zPVar) {
            this.OLrzqt = zPVar;
            this.AEQbTJ = zPVar.AEQbTJ();
            this.copydefault = zPVar.b_();
        }

        @Override // o.AbstractC59439zh.Activity
        public CS EZpvd() {
            return ((zP.Activity) this.OLrzqt).copydefault();
        }
    }

    /* JADX INFO: renamed from: o.zO$Application */
    public static final class Application extends AbstractC59439zh.StateListAnimator {
        public final /* synthetic */ zP AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.Long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public java.lang.Long OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public boolean copydefault() {
            return this.EZpvd;
        }

        public Application(zP zPVar) {
            this.AEQbTJ = zPVar;
            this.copydefault = zPVar.AEQbTJ();
            this.EZpvd = zPVar.b_();
        }

        @Override // o.AbstractC59439zh.StateListAnimator
        public InterfaceC5060De AEQbTJ() {
            return ((zP.Application) this.AEQbTJ).copydefault();
        }
    }

    public static /* synthetic */ CS toSdkByteReadChannel$default(zP zPVar, CoroutineScope coroutineScope, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = null;
        }
        return OLrzqt(zPVar, coroutineScope);
    }

    public static final CS OLrzqt(@NotNull zP zPVar, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(zPVar, "");
        if (zPVar instanceof zP.StateListAnimator) {
            return null;
        }
        if (zPVar instanceof zP.TaskDescription) {
            return CW.SdkByteReadChannel$default(((zP.TaskDescription) zPVar).OLrzqt(), 0, 0, 6, null);
        }
        if (zPVar instanceof zP.Activity) {
            return ((zP.Activity) zPVar).copydefault();
        }
        if (zPVar instanceof zP.Application) {
            return C5062Dg.AEQbTJ(((zP.Application) zPVar).copydefault(), coroutineScope);
        }
        throw new NoWhenBranchMatchedException();
    }
}
