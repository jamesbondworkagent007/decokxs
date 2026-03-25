package com.okinc.kline.features.settings.main.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.main.viewmodel.KlineMainSettingViewModel;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC49411unz;
import o.C36223oTv;
import o.C36246oUr;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.InterfaceC56387yDm;
import o.InterfaceC56554yJr;
import o.oSJ;
import o.oSS;
import o.pUU;
import o.yCM;
import o.yJA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineMainSettingViewModel extends AbstractC49411unz<C36223oTv> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public SettingEntryPoint AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final oSS KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingEntryPoint EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public KlineMainSettingViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oSS oss) {
        super(new C36223oTv(null, 1, null));
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(oss, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = oss;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.oTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineMainSettingViewModel.OLrzqt();
            }
        });
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.settings.main.viewmodel.KlineMainSettingViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final ChartViewOutSideConfig OLrzqt() {
        return C36246oUr.copydefault().zLjUOn();
    }

    public final ChartViewOutSideConfig KWHzl() {
        Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ChartViewOutSideConfig) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull SettingEntryPoint settingEntryPoint, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        KlineMainSettingViewModel$loadSettingList$1 klineMainSettingViewModel$loadSettingList$1;
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        yJA yja;
        KlineMainSettingViewModel klineMainSettingViewModel;
        if (continuation instanceof KlineMainSettingViewModel$loadSettingList$1) {
            klineMainSettingViewModel$loadSettingList$1 = (KlineMainSettingViewModel$loadSettingList$1) continuation;
            int i = klineMainSettingViewModel$loadSettingList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineMainSettingViewModel$loadSettingList$1.label = i - Integer.MIN_VALUE;
            } else {
                klineMainSettingViewModel$loadSettingList$1 = new KlineMainSettingViewModel$loadSettingList$1(this, continuation);
            }
        }
        Object objEZpvd = klineMainSettingViewModel$loadSettingList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineMainSettingViewModel$loadSettingList$1.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            this.AEQbTJ = settingEntryPoint;
            Result.Application application2 = Result.Companion;
            yja = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.settings.main.viewmodel.KlineMainSettingViewModel$loadSettingList$2$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((C36223oTv) obj).copydefault();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((C36223oTv) obj).EZpvd((List<? extends oSJ>) obj2);
                }
            };
            oSS oss = this.KWHzl;
            klineMainSettingViewModel$loadSettingList$1.L$0 = yja;
            klineMainSettingViewModel$loadSettingList$1.L$1 = this;
            klineMainSettingViewModel$loadSettingList$1.label = 1;
            objEZpvd = oss.EZpvd(settingEntryPoint, klineMainSettingViewModel$loadSettingList$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            klineMainSettingViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    thM7380exceptionOrNullimpl.printStackTrace();
                    pUU.copydefault("KlineMainSettingViewModel", "loadSettingData fail cause by: " + Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            }
            klineMainSettingViewModel = (KlineMainSettingViewModel) klineMainSettingViewModel$loadSettingList$1.L$1;
            yja = (InterfaceC56554yJr) klineMainSettingViewModel$loadSettingList$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        klineMainSettingViewModel$loadSettingList$1.L$0 = null;
        klineMainSettingViewModel$loadSettingList$1.L$1 = null;
        klineMainSettingViewModel$loadSettingList$1.label = 2;
        if (klineMainSettingViewModel.KWHzl((InterfaceC56554yJr<T, Object>) yja, objEZpvd, (Continuation<? super Unit>) klineMainSettingViewModel$loadSettingList$1) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KlineMainSettingViewModel$reloadSettingList$1(this, null), 3, null);
    }
}
