package com.okinc.business.market.features.meme.preview;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.meme.data.model.XPostType;
import com.okinc.core.util.SPUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C25389ivm;
import o.C28735kgQ;
import o.C28800khc;
import o.C28803khf;
import o.C28807khj;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC28740kgV;
import o.InterfaceC28744kgZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TwitterPreviewViewModel extends AbstractC33073mpa {
    public boolean AYXKKw;
    public final C28800khc AhwBna;
    public final MutableStateFlow<C28735kgQ> EZpvd;
    public final MutableStateFlow<InterfaceC28740kgV> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC28744kgZ copydefault;
    public final StateFlow<C28735kgQ> djBIcL;
    public boolean gEmmrt;
    public final StateFlow<InterfaceC28740kgV> valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[XPostType.values().length];
            try {
                iArr[XPostType.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[XPostType.COMMUNITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[XPostType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC28740kgV> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C28735kgQ> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public TwitterPreviewViewModel(@NotNull C28800khc c28800khc, @NotNull InterfaceC28744kgZ interfaceC28744kgZ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28800khc, "");
        Intrinsics.checkNotNullParameter(interfaceC28744kgZ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AhwBna = c28800khc;
        this.copydefault = interfaceC28744kgZ;
        this.OLrzqt = coroutineDispatcher;
        MutableStateFlow<InterfaceC28740kgV> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC28740kgV.Activity.OLrzqt);
        this.KWHzl = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C28735kgQ> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C28735kgQ(false, null, false, false, false, null, false, false, 255, null));
        this.EZpvd = MutableStateFlow2;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow2);
        this.AYXKKw = true;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass1(null), 2, null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.preview.TwitterPreviewViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.meme.preview.TwitterPreviewViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwitterPreviewViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                TwitterPreviewViewModel.this.AYXKKw = !SPUtils.getBoolean("key_dex_twitter_redirect", false);
                TwitterPreviewViewModel.this.gEmmrt = SPUtils.getBoolean("key_dex_hide_twitter_translation", false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void djBIcL() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new TwitterPreviewViewModel$hideRedirectNotice$1(this, null), 2, null);
    }

    public final void copydefault(boolean z) {
        this.gEmmrt = z;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new TwitterPreviewViewModel$saveTranslation$1(z, null), 2, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull XPostType xPostType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(xPostType, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new TwitterPreviewViewModel$load$1(this, str, str2, xPostType, null), 2, null);
    }

    public final void AEQbTJ(C28807khj c28807khj) {
        C28735kgQ value;
        C28735kgQ c28735kgQ;
        String strHDKMBd = c28807khj.hDKMBd();
        C28803khf c28803khfValues = c28807khj.values();
        String strValues = c28803khfValues != null ? c28803khfValues.values() : null;
        if (strValues == null) {
            strValues = "";
        }
        if (strHDKMBd.length() <= 0 && strValues.length() <= 0) {
            return;
        }
        MutableStateFlow<C28735kgQ> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            c28735kgQ = value;
        } while (!mutableStateFlow.compareAndSet(value, c28735kgQ.EZpvd((63 & 1) != 0 ? c28735kgQ.gEmmrt : strHDKMBd.length() > 0, (63 & 2) != 0 ? c28735kgQ.EZpvd : strHDKMBd.length() == 0 ? c28735kgQ.OLrzqt() : strHDKMBd, (63 & 4) != 0 ? c28735kgQ.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ.copydefault : false, (63 & 16) != 0 ? c28735kgQ.djBIcL : strValues.length() > 0, (63 & 32) != 0 ? c28735kgQ.AhwBna : strValues.length() == 0 ? c28735kgQ.copydefault() : strValues, (63 & 64) != 0 ? c28735kgQ.KWHzl : false, (63 & 128) != 0 ? c28735kgQ.AEQbTJ : false)));
    }

    public final void gEmmrt() {
        C28735kgQ value;
        C28735kgQ c28735kgQ;
        C28735kgQ value2;
        C28735kgQ c28735kgQ2;
        C28735kgQ value3;
        C28735kgQ c28735kgQ3;
        C28735kgQ value4 = this.EZpvd.getValue();
        boolean zAEQbTJ = value4.AEQbTJ();
        copydefault(zAEQbTJ);
        if (!zAEQbTJ) {
            if (value4.OLrzqt().length() <= 0) {
                InterfaceC28740kgV value5 = this.KWHzl.getValue();
                if (value5 instanceof InterfaceC28740kgV.TaskDescription) {
                    String strHDKMBd = ((InterfaceC28740kgV.TaskDescription) value5).copydefault().hDKMBd();
                    if (strHDKMBd.length() > 0) {
                        MutableStateFlow<C28735kgQ> mutableStateFlow = this.EZpvd;
                        do {
                            value = mutableStateFlow.getValue();
                            c28735kgQ = value;
                        } while (!mutableStateFlow.compareAndSet(value, c28735kgQ.EZpvd((63 & 1) != 0 ? c28735kgQ.gEmmrt : true, (63 & 2) != 0 ? c28735kgQ.EZpvd : strHDKMBd, (63 & 4) != 0 ? c28735kgQ.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ.copydefault : false, (63 & 16) != 0 ? c28735kgQ.djBIcL : false, (63 & 32) != 0 ? c28735kgQ.AhwBna : null, (63 & 64) != 0 ? c28735kgQ.KWHzl : false, (63 & 128) != 0 ? c28735kgQ.AEQbTJ : false)));
                        return;
                    }
                }
                OLrzqt();
                return;
            }
            MutableStateFlow<C28735kgQ> mutableStateFlow2 = this.EZpvd;
            do {
                value2 = mutableStateFlow2.getValue();
                c28735kgQ2 = value2;
            } while (!mutableStateFlow2.compareAndSet(value2, c28735kgQ2.EZpvd((63 & 1) != 0 ? c28735kgQ2.gEmmrt : true, (63 & 2) != 0 ? c28735kgQ2.EZpvd : null, (63 & 4) != 0 ? c28735kgQ2.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ2.copydefault : false, (63 & 16) != 0 ? c28735kgQ2.djBIcL : false, (63 & 32) != 0 ? c28735kgQ2.AhwBna : null, (63 & 64) != 0 ? c28735kgQ2.KWHzl : false, (63 & 128) != 0 ? c28735kgQ2.AEQbTJ : false)));
            return;
        }
        MutableStateFlow<C28735kgQ> mutableStateFlow3 = this.EZpvd;
        do {
            value3 = mutableStateFlow3.getValue();
            c28735kgQ3 = value3;
        } while (!mutableStateFlow3.compareAndSet(value3, c28735kgQ3.EZpvd((63 & 1) != 0 ? c28735kgQ3.gEmmrt : false, (63 & 2) != 0 ? c28735kgQ3.EZpvd : null, (63 & 4) != 0 ? c28735kgQ3.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ3.copydefault : false, (63 & 16) != 0 ? c28735kgQ3.djBIcL : false, (63 & 32) != 0 ? c28735kgQ3.AhwBna : null, (63 & 64) != 0 ? c28735kgQ3.KWHzl : false, (63 & 128) != 0 ? c28735kgQ3.AEQbTJ : false)));
    }

    public final void AYXKKw() {
        C28735kgQ value;
        C28735kgQ c28735kgQ;
        C28735kgQ value2;
        C28735kgQ c28735kgQ2;
        C28735kgQ value3;
        C28735kgQ c28735kgQ3;
        C28735kgQ value4 = this.EZpvd.getValue();
        boolean zAYXKKw = value4.AYXKKw();
        copydefault(zAYXKKw);
        if (!zAYXKKw) {
            if (value4.copydefault().length() <= 0) {
                InterfaceC28740kgV value5 = this.KWHzl.getValue();
                if (value5 instanceof InterfaceC28740kgV.TaskDescription) {
                    C28803khf c28803khfValues = ((InterfaceC28740kgV.TaskDescription) value5).copydefault().values();
                    String strValues = c28803khfValues != null ? c28803khfValues.values() : null;
                    if (strValues == null) {
                        strValues = "";
                    }
                    if (strValues.length() > 0) {
                        MutableStateFlow<C28735kgQ> mutableStateFlow = this.EZpvd;
                        do {
                            value = mutableStateFlow.getValue();
                            c28735kgQ = value;
                        } while (!mutableStateFlow.compareAndSet(value, c28735kgQ.EZpvd((63 & 1) != 0 ? c28735kgQ.gEmmrt : false, (63 & 2) != 0 ? c28735kgQ.EZpvd : null, (63 & 4) != 0 ? c28735kgQ.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ.copydefault : false, (63 & 16) != 0 ? c28735kgQ.djBIcL : true, (63 & 32) != 0 ? c28735kgQ.AhwBna : strValues, (63 & 64) != 0 ? c28735kgQ.KWHzl : false, (63 & 128) != 0 ? c28735kgQ.AEQbTJ : false)));
                        return;
                    }
                }
                AEQbTJ();
                return;
            }
            MutableStateFlow<C28735kgQ> mutableStateFlow2 = this.EZpvd;
            do {
                value2 = mutableStateFlow2.getValue();
                c28735kgQ2 = value2;
            } while (!mutableStateFlow2.compareAndSet(value2, c28735kgQ2.EZpvd((63 & 1) != 0 ? c28735kgQ2.gEmmrt : false, (63 & 2) != 0 ? c28735kgQ2.EZpvd : null, (63 & 4) != 0 ? c28735kgQ2.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ2.copydefault : false, (63 & 16) != 0 ? c28735kgQ2.djBIcL : true, (63 & 32) != 0 ? c28735kgQ2.AhwBna : null, (63 & 64) != 0 ? c28735kgQ2.KWHzl : false, (63 & 128) != 0 ? c28735kgQ2.AEQbTJ : false)));
            return;
        }
        MutableStateFlow<C28735kgQ> mutableStateFlow3 = this.EZpvd;
        do {
            value3 = mutableStateFlow3.getValue();
            c28735kgQ3 = value3;
        } while (!mutableStateFlow3.compareAndSet(value3, c28735kgQ3.EZpvd((63 & 1) != 0 ? c28735kgQ3.gEmmrt : false, (63 & 2) != 0 ? c28735kgQ3.EZpvd : null, (63 & 4) != 0 ? c28735kgQ3.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ3.copydefault : false, (63 & 16) != 0 ? c28735kgQ3.djBIcL : false, (63 & 32) != 0 ? c28735kgQ3.AhwBna : null, (63 & 64) != 0 ? c28735kgQ3.KWHzl : false, (63 & 128) != 0 ? c28735kgQ3.AEQbTJ : false)));
    }

    public final int AEQbTJ(XPostType xPostType) {
        int i = TaskDescription.OLrzqt[xPostType.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        String strAEQbTJ;
        C28735kgQ value;
        C28735kgQ c28735kgQ;
        InterfaceC28740kgV value2 = this.KWHzl.getValue();
        InterfaceC28740kgV.TaskDescription taskDescription = value2 instanceof InterfaceC28740kgV.TaskDescription ? (InterfaceC28740kgV.TaskDescription) value2 : null;
        if (taskDescription == null) {
            return;
        }
        String strCopydefault = taskDescription.copydefault().copydefault();
        if (strCopydefault.length() == 0) {
            return;
        }
        int iAEQbTJ = AEQbTJ(taskDescription.copydefault().getNewProxyInstance());
        if (iAEQbTJ == 2) {
            C28803khf c28803khfValues = taskDescription.copydefault().values();
            strAEQbTJ = c28803khfValues != null ? c28803khfValues.AEQbTJ() : null;
            if (strAEQbTJ == null) {
            }
        } else {
            strAEQbTJ = "";
        }
        List listEZpvd = strAEQbTJ.length() > 0 ? C56402yEa.EZpvd(strAEQbTJ) : null;
        MutableStateFlow<C28735kgQ> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            c28735kgQ = value;
        } while (!mutableStateFlow.compareAndSet(value, c28735kgQ.EZpvd((63 & 1) != 0 ? c28735kgQ.gEmmrt : false, (63 & 2) != 0 ? c28735kgQ.EZpvd : null, (63 & 4) != 0 ? c28735kgQ.OLrzqt : true, (63 & 8) != 0 ? c28735kgQ.copydefault : false, (63 & 16) != 0 ? c28735kgQ.djBIcL : false, (63 & 32) != 0 ? c28735kgQ.AhwBna : null, (63 & 64) != 0 ? c28735kgQ.KWHzl : false, (63 & 128) != 0 ? c28735kgQ.AEQbTJ : false)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new TwitterPreviewViewModel$fetchMainTranslation$2(this, strCopydefault, listEZpvd, iAEQbTJ, null), 2, null);
    }

    public final void AEQbTJ() {
        C28735kgQ value;
        C28735kgQ c28735kgQ;
        InterfaceC28740kgV value2 = this.KWHzl.getValue();
        InterfaceC28740kgV.TaskDescription taskDescription = value2 instanceof InterfaceC28740kgV.TaskDescription ? (InterfaceC28740kgV.TaskDescription) value2 : null;
        if (taskDescription == null) {
            return;
        }
        String strCopydefault = taskDescription.copydefault().copydefault();
        if (strCopydefault.length() == 0) {
            return;
        }
        C28803khf c28803khfValues = taskDescription.copydefault().values();
        String strAEQbTJ = c28803khfValues != null ? c28803khfValues.AEQbTJ() : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        List listEZpvd = strAEQbTJ.length() > 0 ? C56402yEa.EZpvd(strAEQbTJ) : null;
        MutableStateFlow<C28735kgQ> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
            c28735kgQ = value;
        } while (!mutableStateFlow.compareAndSet(value, c28735kgQ.EZpvd((63 & 1) != 0 ? c28735kgQ.gEmmrt : false, (63 & 2) != 0 ? c28735kgQ.EZpvd : null, (63 & 4) != 0 ? c28735kgQ.OLrzqt : false, (63 & 8) != 0 ? c28735kgQ.copydefault : false, (63 & 16) != 0 ? c28735kgQ.djBIcL : false, (63 & 32) != 0 ? c28735kgQ.AhwBna : null, (63 & 64) != 0 ? c28735kgQ.KWHzl : true, (63 & 128) != 0 ? c28735kgQ.AEQbTJ : false)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.OLrzqt, null, new TwitterPreviewViewModel$fetchQuoteTranslation$2(this, strCopydefault, listEZpvd, taskDescription, null), 2, null);
    }
}
