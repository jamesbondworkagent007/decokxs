package o;

import android.content.ClipData;
import android.os.Build;
import com.okinc.lifecycle.api.business.clipboard.ClipBoardContentType;
import com.okinc.lifecycle.impl.clipboard.ClipBoardContentManagerImpl$checkClipContent$1;
import com.okinc.lifecycle.impl.clipboard.ClipBoardContentManagerImpl$getClipBoardContentEvent$2;
import com.okinc.lifecycle.impl.clipboard.ClipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1;
import com.okinc.lifecycle.impl.clipboard.ClipBoardContentManagerImpl$observeLockScreenState$3;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C38074pLg implements InterfaceC38073pLf {
    public final InterfaceC56387yDm<android.content.ClipboardManager> AEQbTJ;
    public final C54819xWm EZpvd;
    public final InterfaceC54816xWj KWHzl;
    public final CoroutineScope OLrzqt;
    public final InterfaceC8108awX copydefault;
    public final java.util.Map<ClipBoardContentType, pKA> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<ClipBoardContentType, pKA> djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yDm<? extends android.content.ClipboardManager> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C38074pLg(@NotNull CoroutineScope coroutineScope, @NotNull InterfaceC56387yDm<? extends android.content.ClipboardManager> interfaceC56387yDm, @NotNull C54819xWm c54819xWm, @NotNull InterfaceC8108awX interfaceC8108awX) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(c54819xWm, "");
        Intrinsics.checkNotNullParameter(interfaceC8108awX, "");
        this.OLrzqt = coroutineScope;
        this.AEQbTJ = interfaceC56387yDm;
        this.EZpvd = c54819xWm;
        this.copydefault = interfaceC8108awX;
        this.valueOf = new LinkedHashMap();
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.KWHzl = stateListAnimator;
        c54819xWm.AEQbTJ(stateListAnimator);
        KWHzl();
    }

    /* JADX INFO: renamed from: o.pLg$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public StateListAnimator() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            C38074pLg.this.KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.pLg$TaskDescription */
    public static final class TaskDescription implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.pLg$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ClipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1 clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1;
                if (continuation instanceof ClipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1) {
                    clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1 = (ClipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1) continuation;
                    int i = clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1 = new ClipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, clipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void OLrzqt() {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                copydefault().clearPrimaryClip();
            } else {
                copydefault().setPrimaryClip(android.content.ClipData.newPlainText("", " "));
            }
        } catch (java.lang.Exception unused) {
            pUU.EZpvd(C38074pLg.class.getSimpleName(), "Failed to clear clipboard");
        }
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, Dispatchers.getMain(), null, new ClipBoardContentManagerImpl$checkClipContent$1(this, null), 2, null);
    }

    public final java.lang.Object KWHzl(Continuation<? super java.lang.Boolean> continuation) {
        return FlowKt.first(new TaskDescription(this.copydefault.OLrzqt()), new ClipBoardContentManagerImpl$observeLockScreenState$3(this, null), continuation);
    }

    public final boolean gEmmrt() {
        if (!this.valueOf.isEmpty()) {
            if (this.EZpvd.AEQbTJ() == null) {
                return true;
            }
            java.lang.String simpleName = this.EZpvd.AEQbTJ().getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) simpleName, (java.lang.CharSequence) "SecurityVerifyLockScreenActivity", false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.Object AEQbTJ(Continuation<? super pKB> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ClipBoardContentManagerImpl$getClipBoardContentEvent$2(this, null), continuation);
    }

    public final java.lang.String EZpvd() {
        java.lang.CharSequence text;
        try {
            android.content.ClipData clipDataAEQbTJ = AEQbTJ();
            if (clipDataAEQbTJ != null && clipDataAEQbTJ.getItemCount() >= 0) {
                android.content.ClipDescription description = clipDataAEQbTJ.getDescription();
                java.lang.String string = null;
                if (!Intrinsics.EZpvd((java.lang.Object) (description != null ? description.getLabel() : null), (java.lang.Object) "okex.clip")) {
                    ClipData.Item itemAt = clipDataAEQbTJ.getItemAt(0);
                    if (itemAt != null && (text = itemAt.getText()) != null) {
                        string = text.toString();
                    }
                    if (string != null) {
                        return string;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return "";
    }

    public final android.content.ClipData AEQbTJ() {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                if (copydefault().getPrimaryClipDescription() != null && java.lang.Double.compare(r0.getConfidenceScore("flight"), 1.0d) == 0 && java.lang.Double.compare(r0.getConfidenceScore("url"), 1.0d) == 0) {
                    return copydefault().getPrimaryClip();
                }
                return null;
            } catch (java.lang.Exception unused) {
                return copydefault().getPrimaryClip();
            }
        }
        return copydefault().getPrimaryClip();
    }

    public final android.content.ClipboardManager copydefault() {
        return this.AEQbTJ.getValue();
    }
}
