package aws.sdk.kotlin.runtime.config;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54779xV;
import o.ArrayIndexOutOfBoundsException;
import o.C56391yDq;
import o.C56442yFn;
import o.C57472yj;
import o.C57525yk;
import o.C59333zf;
import o.DW;
import o.FilterInputStream;
import o.FilterReader;
import o.FilterWriter;
import o.GU;
import o.HE;
import o.HH;
import o.HL;
import o.IOError;
import o.InterfaceC57154yd;
import o.InterfaceC57207ye;
import o.InterfaceC57313yg;
import o.InterfaceC57366yh;
import o.ObjectOutputStream;
import o.ObjectStreamField;
import o.OptionalDataException;
import o.PipedOutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $block$inlined;
    final /* synthetic */ InterfaceC57154yd.StateListAnimator $builder$inlined;
    final /* synthetic */ InterfaceC57313yg.Activity $config$inlined;
    final /* synthetic */ GU $span;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ IOError this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1(GU gu, Continuation continuation, InterfaceC57313yg.Activity activity, Function1 function1, IOError iOError, InterfaceC57154yd.StateListAnimator stateListAnimator) {
        super(2, continuation);
        this.$span = gu;
        this.$config$inlined = activity;
        this.$block$inlined = function1;
        this.this$0 = iOError;
        this.$builder$inlined = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        AbstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1 abstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1 = new AbstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1(this.$span, continuation, this.$config$inlined, this.$block$inlined, this.this$0, this.$builder$inlined);
        abstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1.L$0 = obj;
        return abstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AbstractAwsSdkClientFactory$fromEnvironment$$inlined$withSpan$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        HL hlCopydefault;
        HH<ObjectOutputStream> hhAEQbTJ;
        HH<ObjectStreamField> hhAEQbTJ2;
        InterfaceC57207ye.StateListAnimator stateListAnimator;
        Function1 function1;
        AbstractC54779xV abstractC54779xVDbNXlk;
        FilterInputStream.Application application;
        String strValues;
        FilterInputStream.Application application2;
        Boolean boolFJNWhG;
        FilterInputStream.Application application3;
        Boolean boolFIwbmz;
        HH<ObjectStreamField> hh;
        HH<ObjectOutputStream> hh2;
        HL hl;
        FilterInputStream.Application application4;
        String strEZpvd;
        InterfaceC57313yg.Activity activity;
        C57472yj.Activity activityCopydefault;
        Boolean boolKWHzl;
        C57472yj.Activity activityCopydefault2;
        Long lEZpvd;
        IOError iOError;
        InterfaceC57154yd.StateListAnimator stateListAnimator2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                hlCopydefault = HL.OLrzqt.copydefault();
                hhAEQbTJ = HE.AEQbTJ(new AbstractAwsSdkClientFactory$fromEnvironment$2$sharedConfig$1(hlCopydefault, null));
                hhAEQbTJ2 = HE.AEQbTJ(new AbstractAwsSdkClientFactory$fromEnvironment$2$profile$1(hhAEQbTJ, null));
                InterfaceC57313yg.Activity activity2 = this.$config$inlined;
                if (activity2 instanceof InterfaceC57207ye.StateListAnimator) {
                    stateListAnimator = (InterfaceC57207ye.StateListAnimator) activity2;
                    this.L$0 = hlCopydefault;
                    this.L$1 = hhAEQbTJ;
                    this.L$2 = hhAEQbTJ2;
                    this.L$3 = stateListAnimator;
                    this.label = 1;
                    obj = PipedOutputStream.resolveRetryStrategy$default(null, hhAEQbTJ2, this, 1, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    stateListAnimator.KWHzl((DW) obj);
                }
                function1 = this.$block$inlined;
                if (function1 != null) {
                    function1.invoke(this.$config$inlined);
                }
                InterfaceC57313yg.Activity activity3 = this.$config$inlined;
                abstractC54779xVDbNXlk = activity3.DbNXlk();
                if (abstractC54779xVDbNXlk == null) {
                    abstractC54779xVDbNXlk = (AbstractC54779xV) C59333zf.AEQbTJ(C57525yk.copydefault.KWHzl(), hlCopydefault);
                }
                activity3.KWHzl(abstractC54779xVDbNXlk);
                application = (FilterInputStream.Application) this.$config$inlined;
                strValues = application.values();
                if (strValues == null) {
                    this.L$0 = hlCopydefault;
                    this.L$1 = hhAEQbTJ;
                    this.L$2 = hhAEQbTJ2;
                    this.L$3 = application;
                    this.label = 2;
                    obj = ArrayIndexOutOfBoundsException.resolveRegion$default(null, hhAEQbTJ2, this, 1, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    strValues = (String) obj;
                }
                application.OLrzqt(strValues);
                application2 = (FilterInputStream.Application) this.$config$inlined;
                boolFJNWhG = application2.fJNWhG();
                if (boolFJNWhG == null) {
                    this.L$0 = hlCopydefault;
                    this.L$1 = hhAEQbTJ;
                    this.L$2 = hhAEQbTJ2;
                    this.L$3 = application2;
                    this.label = 3;
                    obj = FilterWriter.resolveUseFips$default(null, hhAEQbTJ2, this, 1, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    boolFJNWhG = (Boolean) obj;
                }
                application2.copydefault(boolFJNWhG);
                application3 = (FilterInputStream.Application) this.$config$inlined;
                boolFIwbmz = application3.fIwbmz();
                if (boolFIwbmz == null) {
                    hh = hhAEQbTJ2;
                    hh2 = hhAEQbTJ;
                    hl = hlCopydefault;
                    application3.KWHzl(boolFIwbmz);
                    application4 = (FilterInputStream.Application) this.$config$inlined;
                    strEZpvd = application4.EZpvd();
                    if (strEZpvd == null) {
                    }
                    application4.copydefault(strEZpvd);
                    activity = this.$config$inlined;
                    if (activity instanceof InterfaceC57366yh.Activity) {
                    }
                    iOError = this.this$0;
                    stateListAnimator2 = this.$builder$inlined;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 8;
                    if (iOError.AEQbTJ(stateListAnimator2, hh2, hh, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                this.L$0 = hlCopydefault;
                this.L$1 = hhAEQbTJ;
                this.L$2 = hhAEQbTJ2;
                this.L$3 = application3;
                this.label = 4;
                obj = FilterWriter.resolveUseDualStack$default(null, hhAEQbTJ2, this, 1, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                hh = hhAEQbTJ2;
                hh2 = hhAEQbTJ;
                hl = hlCopydefault;
                boolFIwbmz = (Boolean) obj;
                application3.KWHzl(boolFIwbmz);
                application4 = (FilterInputStream.Application) this.$config$inlined;
                strEZpvd = application4.EZpvd();
                if (strEZpvd == null) {
                    this.L$0 = hl;
                    this.L$1 = hh2;
                    this.L$2 = hh;
                    this.L$3 = application4;
                    this.label = 5;
                    obj = OptionalDataException.EZpvd(hl, hh, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    strEZpvd = (String) obj;
                }
                application4.copydefault(strEZpvd);
                activity = this.$config$inlined;
                if (activity instanceof InterfaceC57366yh.Activity) {
                    activityCopydefault = ((InterfaceC57366yh.Activity) activity).copydefault();
                    boolKWHzl = ((InterfaceC57366yh.Activity) this.$config$inlined).copydefault().KWHzl();
                    if (boolKWHzl == null) {
                        this.L$0 = hl;
                        this.L$1 = hh2;
                        this.L$2 = hh;
                        this.L$3 = activityCopydefault;
                        this.label = 6;
                        obj = FilterReader.EZpvd(hl, hh, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        boolKWHzl = (Boolean) obj;
                    }
                    activityCopydefault.AEQbTJ(boolKWHzl);
                    activityCopydefault2 = ((InterfaceC57366yh.Activity) this.$config$inlined).copydefault();
                    lEZpvd = ((InterfaceC57366yh.Activity) this.$config$inlined).copydefault().EZpvd();
                    if (lEZpvd == null) {
                        this.L$0 = hh2;
                        this.L$1 = hh;
                        this.L$2 = activityCopydefault2;
                        this.L$3 = null;
                        this.label = 7;
                        obj = FilterReader.AEQbTJ(hl, hh, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        lEZpvd = (Long) obj;
                    }
                    activityCopydefault2.EZpvd(lEZpvd);
                }
                iOError = this.this$0;
                stateListAnimator2 = this.$builder$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 8;
                if (iOError.AEQbTJ(stateListAnimator2, hh2, hh, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                stateListAnimator = (InterfaceC57207ye.StateListAnimator) this.L$3;
                hhAEQbTJ2 = (HH) this.L$2;
                hhAEQbTJ = (HH) this.L$1;
                hlCopydefault = (HL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                stateListAnimator.KWHzl((DW) obj);
                function1 = this.$block$inlined;
                if (function1 != null) {
                }
                InterfaceC57313yg.Activity activity32 = this.$config$inlined;
                abstractC54779xVDbNXlk = activity32.DbNXlk();
                if (abstractC54779xVDbNXlk == null) {
                }
                activity32.KWHzl(abstractC54779xVDbNXlk);
                application = (FilterInputStream.Application) this.$config$inlined;
                strValues = application.values();
                if (strValues == null) {
                }
                application.OLrzqt(strValues);
                application2 = (FilterInputStream.Application) this.$config$inlined;
                boolFJNWhG = application2.fJNWhG();
                if (boolFJNWhG == null) {
                }
                application2.copydefault(boolFJNWhG);
                application3 = (FilterInputStream.Application) this.$config$inlined;
                boolFIwbmz = application3.fIwbmz();
                if (boolFIwbmz == null) {
                }
                break;
            case 2:
                application = (FilterInputStream.Application) this.L$3;
                hhAEQbTJ2 = (HH) this.L$2;
                hhAEQbTJ = (HH) this.L$1;
                hlCopydefault = (HL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                strValues = (String) obj;
                application.OLrzqt(strValues);
                application2 = (FilterInputStream.Application) this.$config$inlined;
                boolFJNWhG = application2.fJNWhG();
                if (boolFJNWhG == null) {
                }
                application2.copydefault(boolFJNWhG);
                application3 = (FilterInputStream.Application) this.$config$inlined;
                boolFIwbmz = application3.fIwbmz();
                if (boolFIwbmz == null) {
                }
                break;
            case 3:
                application2 = (FilterInputStream.Application) this.L$3;
                hhAEQbTJ2 = (HH) this.L$2;
                hhAEQbTJ = (HH) this.L$1;
                hlCopydefault = (HL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                boolFJNWhG = (Boolean) obj;
                application2.copydefault(boolFJNWhG);
                application3 = (FilterInputStream.Application) this.$config$inlined;
                boolFIwbmz = application3.fIwbmz();
                if (boolFIwbmz == null) {
                }
                break;
            case 4:
                application3 = (FilterInputStream.Application) this.L$3;
                hh = (HH) this.L$2;
                hh2 = (HH) this.L$1;
                hl = (HL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                boolFIwbmz = (Boolean) obj;
                application3.KWHzl(boolFIwbmz);
                application4 = (FilterInputStream.Application) this.$config$inlined;
                strEZpvd = application4.EZpvd();
                if (strEZpvd == null) {
                }
                application4.copydefault(strEZpvd);
                activity = this.$config$inlined;
                if (activity instanceof InterfaceC57366yh.Activity) {
                }
                iOError = this.this$0;
                stateListAnimator2 = this.$builder$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 8;
                if (iOError.AEQbTJ(stateListAnimator2, hh2, hh, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                application4 = (FilterInputStream.Application) this.L$3;
                hh = (HH) this.L$2;
                hh2 = (HH) this.L$1;
                hl = (HL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                strEZpvd = (String) obj;
                application4.copydefault(strEZpvd);
                activity = this.$config$inlined;
                if (activity instanceof InterfaceC57366yh.Activity) {
                }
                iOError = this.this$0;
                stateListAnimator2 = this.$builder$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 8;
                if (iOError.AEQbTJ(stateListAnimator2, hh2, hh, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                activityCopydefault = (C57472yj.Activity) this.L$3;
                hh = (HH) this.L$2;
                hh2 = (HH) this.L$1;
                hl = (HL) this.L$0;
                C56391yDq.AEQbTJ(obj);
                boolKWHzl = (Boolean) obj;
                activityCopydefault.AEQbTJ(boolKWHzl);
                activityCopydefault2 = ((InterfaceC57366yh.Activity) this.$config$inlined).copydefault();
                lEZpvd = ((InterfaceC57366yh.Activity) this.$config$inlined).copydefault().EZpvd();
                if (lEZpvd == null) {
                }
                activityCopydefault2.EZpvd(lEZpvd);
                iOError = this.this$0;
                stateListAnimator2 = this.$builder$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 8;
                if (iOError.AEQbTJ(stateListAnimator2, hh2, hh, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                activityCopydefault2 = (C57472yj.Activity) this.L$2;
                hh = (HH) this.L$1;
                hh2 = (HH) this.L$0;
                C56391yDq.AEQbTJ(obj);
                lEZpvd = (Long) obj;
                activityCopydefault2.EZpvd(lEZpvd);
                iOError = this.this$0;
                stateListAnimator2 = this.$builder$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 8;
                if (iOError.AEQbTJ(stateListAnimator2, hh2, hh, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
