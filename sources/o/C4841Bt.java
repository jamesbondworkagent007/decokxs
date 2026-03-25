package o;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import o.InterfaceC54725xT;
import o.InterfaceC59524zif;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4841Bt implements InterfaceC54725xT<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> {
    public TimeMark AEQbTJ;
    public final InterfaceC59524zif AYXKKw;
    public final java.lang.String AhwBna;
    public final BT EZpvd;
    public int KWHzl;
    public TimeMark OLrzqt;
    public TimeMark copydefault;
    public final InterfaceC57843yq djBIcL;
    public TimeMark gEmmrt;
    public final java.lang.String valueOf;

    public C4841Bt(@NotNull BT bt, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC59524zif interfaceC59524zif) {
        Intrinsics.checkNotNullParameter(bt, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC59524zif, "");
        this.EZpvd = bt;
        this.valueOf = str;
        this.AhwBna = str2;
        this.AYXKKw = interfaceC59524zif;
        C58002yt c58002yt = new C58002yt();
        c58002yt.AEQbTJ("rpc.service", str);
        c58002yt.AEQbTJ("rpc.method", str2);
        this.djBIcL = c58002yt.AEQbTJ();
    }

    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeAttemptCompletion-gIAlu-s */
    public java.lang.Object mo5946modifyBeforeAttemptCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        return InterfaceC54725xT.StateListAnimator.KWHzl((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
    }

    @Override // o.InterfaceC54725xT
    /* JADX INFO: renamed from: modifyBeforeCompletion-gIAlu-s */
    public java.lang.Object mo5947modifyBeforeCompletiongIAlus(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54860xY) interfaceC54860xY, (Continuation) continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeDeserialization(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX, @NotNull Continuation<? super InterfaceC5039Cj> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX, (Continuation) continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeRetryLoop(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ, (Continuation) continuation);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.ya<java.lang.Object>, kotlin.coroutines.Continuation<java.lang.Object>] */
    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeSerialization(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya, @NotNull Continuation<? super java.lang.Object> continuation) {
        return InterfaceC54725xT.StateListAnimator.OLrzqt(this, interfaceC56995ya, continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        return InterfaceC54725xT.StateListAnimator.KWHzl(this, interfaceC54887xZ, continuation);
    }

    @Override // o.InterfaceC54725xT
    public java.lang.Object modifyBeforeTransmit(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ, @NotNull Continuation<? super InterfaceC5037Ch> continuation) {
        return InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ, continuation);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.EZpvd(this, interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readAfterTransmit(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
        InterfaceC54725xT.StateListAnimator.EZpvd((InterfaceC54725xT) this, (InterfaceC54833xX) interfaceC54833xX);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeSigning(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.OLrzqt((InterfaceC54725xT) this, (InterfaceC54887xZ) interfaceC54887xZ);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeTransmit(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        InterfaceC54725xT.StateListAnimator.copydefault(this, interfaceC54887xZ);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.BT)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:o.zif:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.zif:0x0004: SGET  A[WRAPPED] (LINE:37) o.zif.StateListAnimator.AEQbTJ o.zif$StateListAnimator) : (r4v0 o.zif))
 A[MD:(o.BT, java.lang.String, java.lang.String, o.zif):void (m)] (LINE:33) call: o.Bt.<init>(o.BT, java.lang.String, java.lang.String, o.zif):void type: THIS */
    public /* synthetic */ C4841Bt(BT bt, java.lang.String str, java.lang.String str2, InterfaceC59524zif interfaceC59524zif, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bt, str, str2, (i & 8) != 0 ? InterfaceC59524zif.StateListAnimator.AEQbTJ : interfaceC59524zif);
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeExecution(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya) {
        Intrinsics.checkNotNullParameter(interfaceC56995ya, "");
        this.copydefault = this.AYXKKw.KWHzl();
    }

    @Override // o.InterfaceC54725xT
    public void readAfterExecution(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        InterfaceC57843yq interfaceC57843yq;
        Intrinsics.checkNotNullParameter(interfaceC54860xY, "");
        FW fwOLrzqt = this.EZpvd.copydefault().OLrzqt().OLrzqt();
        TimeMark timeMark = this.copydefault;
        if (timeMark != null) {
            GF.copydefault(this.EZpvd.djBIcL(), timeMark.copydefault(), this.djBIcL, fwOLrzqt);
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(interfaceC54860xY.copydefault());
        if (thM7380exceptionOrNullimpl != null) {
            java.lang.String strValueOf = C56524yIo.AEQbTJ(thM7380exceptionOrNullimpl.getClass()).valueOf();
            if (strValueOf != null) {
                C58002yt c58002yt = new C58002yt();
                c58002yt.AEQbTJ("exception.type", strValueOf);
                InterfaceC56293yA interfaceC56293yAAEQbTJ = c58002yt.AEQbTJ();
                C58108yv.KWHzl(interfaceC56293yAAEQbTJ, this.djBIcL);
                interfaceC57843yq = interfaceC56293yAAEQbTJ;
            } else {
                interfaceC57843yq = this.djBIcL;
            }
            this.EZpvd.gEmmrt().AEQbTJ(1L, interfaceC57843yq, fwOLrzqt);
        }
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeSerialization(@NotNull InterfaceC56995ya<java.lang.Object> interfaceC56995ya) {
        Intrinsics.checkNotNullParameter(interfaceC56995ya, "");
        this.gEmmrt = this.AYXKKw.KWHzl();
    }

    @Override // o.InterfaceC54725xT
    public void readAfterSerialization(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        Intrinsics.checkNotNullParameter(interfaceC54887xZ, "");
        TimeMark timeMark = this.gEmmrt;
        if (timeMark != null) {
            GF.copydefault(this.EZpvd.values(), timeMark.copydefault(), this.djBIcL, this.EZpvd.copydefault().OLrzqt().OLrzqt());
        }
    }

    @Override // o.InterfaceC54725xT
    public void readAfterAttempt(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        Intrinsics.checkNotNullParameter(interfaceC54860xY, "");
        this.EZpvd.AhwBna().AEQbTJ(1L, this.djBIcL, this.EZpvd.copydefault().OLrzqt().OLrzqt());
        this.KWHzl++;
        TimeMark timeMark = this.AEQbTJ;
        if (timeMark != null) {
            long jCopydefault = timeMark.copydefault();
            GF.copydefault(this.EZpvd.valueOf(), jCopydefault, this.djBIcL, this.EZpvd.copydefault().OLrzqt().OLrzqt());
            C59462zhW c59462zhW = (C59462zhW) C58108yv.copydefault(interfaceC54860xY.KWHzl(), C3815At.EZpvd.KWHzl());
            if (c59462zhW != null) {
                GF.m8550recordSecondsdWUq8MI$default(this.EZpvd.AYXKKw(), C59462zhW.OLrzqt(jCopydefault, c59462zhW.copydefault()), this.djBIcL, null, 4, null);
            }
        }
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeDeserialization(@NotNull InterfaceC54833xX<java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54833xX) {
        Intrinsics.checkNotNullParameter(interfaceC54833xX, "");
        this.OLrzqt = this.AYXKKw.KWHzl();
    }

    @Override // o.InterfaceC54725xT
    public void readAfterDeserialization(@NotNull InterfaceC54860xY<java.lang.Object, java.lang.Object, InterfaceC5037Ch, InterfaceC5039Cj> interfaceC54860xY) {
        Intrinsics.checkNotNullParameter(interfaceC54860xY, "");
        TimeMark timeMark = this.OLrzqt;
        if (timeMark != null) {
            GF.copydefault(this.EZpvd.EZpvd(), timeMark.copydefault(), this.djBIcL, this.EZpvd.copydefault().OLrzqt().OLrzqt());
        }
    }

    @Override // o.InterfaceC54725xT
    public void readBeforeAttempt(@NotNull InterfaceC54887xZ<java.lang.Object, InterfaceC5037Ch> interfaceC54887xZ) {
        Intrinsics.checkNotNullParameter(interfaceC54887xZ, "");
        this.AEQbTJ = this.AYXKKw.KWHzl();
    }
}
