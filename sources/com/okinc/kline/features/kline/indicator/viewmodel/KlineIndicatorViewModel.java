package com.okinc.kline.features.kline.indicator.viewmodel;

import com.okinc.kline.features.kline.indicator.viewmodel.KlineIndicatorViewModel;
import com.okinc.kline.library.template.TemplateSetting;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC49411unz;
import o.C36246oUr;
import o.C56391yDq;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.oLZ;
import o.oRQ;
import o.oRS;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineIndicatorViewModel extends AbstractC49411unz<oRQ> {
    public final InterfaceC56387yDm EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final oRS OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public KlineIndicatorViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oRS ors) {
        super(new oRQ(null, 1, null));
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(ors, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = ors;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.oRZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineIndicatorViewModel.AEQbTJ();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.oRW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return KlineIndicatorViewModel.KWHzl(this.KWHzl);
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.features.kline.indicator.viewmodel.KlineIndicatorViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final C36246oUr AEQbTJ() {
        return C36246oUr.copydefault();
    }

    public final C36246oUr EZpvd() {
        return (C36246oUr) this.EZpvd.getValue();
    }

    public static final TemplateSetting KWHzl(KlineIndicatorViewModel klineIndicatorViewModel) {
        return klineIndicatorViewModel.EZpvd().KWHzl("ds0");
    }

    private final TemplateSetting copydefault() {
        return (TemplateSetting) this.copydefault.getValue();
    }

    public final void KWHzl() {
        Object objM7377constructorimpl;
        ArrayList<String> mainIndicatorNames = copydefault().getMainIndicatorNames();
        if (mainIndicatorNames == null || !mainIndicatorNames.contains("SR")) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            C36246oUr c36246oUrEZpvd = EZpvd();
            oRS ors = this.OLrzqt;
            Unit unit = Unit.INSTANCE;
            c36246oUrEZpvd.AEQbTJ((oLZ) ors.EZpvd(unit));
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("KlineIndicatorViewModel", "calculateSupportResistanceLine fail cause by: " + thM7380exceptionOrNullimpl);
        }
    }
}
