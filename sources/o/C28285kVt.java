package o;

import com.okinc.business.trade.features.home.meme.repository.MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1;
import com.okinc.business.trade.features.home.meme.repository.MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28285kVt implements InterfaceC28284kVs {
    public final MutableSharedFlow<Application> OLrzqt = SharedFlowKt.MutableSharedFlow$default(0, Integer.MAX_VALUE, null, 5, null);

    /* JADX INFO: renamed from: o.kVt$Application */
    public static final class Application {
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = application.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = application.OLrzqt;
            }
            return application.copydefault(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Application(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LocalPresetTypeChangedEvent(chainId=" + this.EZpvd + ", walletAddress=" + this.copydefault + ", presetType=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
        }
    }

    @Override // o.InterfaceC28284kVs
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23317hvu.OLrzqt(str2, str);
    }

    @Override // o.InterfaceC28284kVs
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C23317hvu.EZpvd(str3, str2, str);
    }

    /* JADX INFO: renamed from: o.kVt$StateListAnimator */
    public static final class StateListAnimator implements Flow<Application> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX INFO: renamed from: o.kVt$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ java.lang.String OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, java.lang.String str, java.lang.String str2) {
                this.copydefault = flowCollector;
                this.OLrzqt = str;
                this.AEQbTJ = str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1 memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1;
                if (continuation instanceof MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1) {
                    memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1 = (MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1) continuation;
                    int i = memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1 = new MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    Application application = (Application) obj;
                    if (Intrinsics.EZpvd((java.lang.Object) application.AEQbTJ(), (java.lang.Object) this.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) application.copydefault(), (java.lang.Object) this.AEQbTJ)) {
                        memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, java.lang.String str, java.lang.String str2) {
            this.AEQbTJ = flow;
            this.KWHzl = str;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super Application> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.KWHzl, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kVt$TaskDescription */
    public static final class TaskDescription implements Flow<java.lang.String> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.kVt$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1 memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1;
                if (continuation instanceof MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1) {
                    memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1 = (MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1) continuation;
                    int i = memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1 = new MemeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.lang.String strKWHzl = ((Application) obj).KWHzl();
                    memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(strKWHzl, memeLocalPresetRepositoryImpl$subscribeLocalPresetTypeChanged$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC28284kVs
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt.tryEmit(new Application(str, str2, str3));
    }

    @Override // o.InterfaceC28284kVs
    public Flow<java.lang.String> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TaskDescription(new StateListAnimator(this.OLrzqt, str, str2));
    }
}
