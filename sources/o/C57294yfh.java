package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.C57227yeT;
import o.C57233yeZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yfh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57294yfh extends ConstraintLayout {
    public C57233yeZ.StateListAnimator EZpvd;
    public C57233yeZ.Activity KWHzl;
    public C57233yeZ.ActionBar OLrzqt;
    public final C17111ewd copydefault;
    public C57233yeZ.Application valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWordBackspaceDownListener(C57233yeZ.StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWordEditorActionListener(C57233yeZ.ActionBar actionBar) {
        this.OLrzqt = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWordFocusGainedListener(C57233yeZ.Activity activity) {
        this.KWHzl = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWordTextChangedListener(C57233yeZ.Application application) {
        this.valueOf = application;
    }

    /* JADX INFO: renamed from: o.yfh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yfh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57294yfh(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C17111ewd c17111ewdOLrzqt = C17111ewd.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c17111ewdOLrzqt, "");
        this.copydefault = c17111ewdOLrzqt;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setMinHeight(C55298xhM.OLrzqt(72, context2));
        RecyclerView recyclerView = c17111ewdOLrzqt.AEQbTJ;
        final android.content.Context context3 = getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context3) { // from class: com.okinc.wallet.widget.input.address.WalletAddressDataInputLayout$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        RecyclerView recyclerView2 = c17111ewdOLrzqt.AEQbTJ;
        java.util.concurrent.Executor mainExecutor = ContextCompat.getMainExecutor(getContext());
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        recyclerView2.setAdapter(new C57226yeS(mainExecutor, new C57233yeZ.Activity() { // from class: o.yfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.Activity
            public final void EZpvd(int i) {
                C57294yfh.KWHzl(this.AEQbTJ, i);
            }
        }, new C57233yeZ.StateListAnimator() { // from class: o.yfj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.StateListAnimator
            public final boolean copydefault(int i, java.lang.CharSequence charSequence) {
                return C57294yfh.EZpvd(this.copydefault, i, charSequence);
            }
        }, new C57233yeZ.Application() { // from class: o.yfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.Application
            public final void copydefault(int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                C57294yfh.AEQbTJ(this.KWHzl, i, charSequence, charSequence2);
            }
        }, new C57233yeZ.ActionBar() { // from class: o.yfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.ActionBar
            public final boolean copydefault(int i, int i2, android.view.KeyEvent keyEvent, java.lang.String str) {
                return C57294yfh.copydefault(this.KWHzl, i, i2, keyEvent, str);
            }
        }));
        RecyclerView recyclerView3 = c17111ewdOLrzqt.AEQbTJ;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView3.setItemAnimator(defaultItemAnimator);
        c17111ewdOLrzqt.AEQbTJ.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() { // from class: o.yfh.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                pUU.KWHzl("WalletAddressDataInputLayout", "onChildViewDetachedFromWindow: " + view);
            }
        });
        c17111ewdOLrzqt.AEQbTJ.setPreserveFocusAfterLayout(false);
        c17111ewdOLrzqt.KWHzl.setSaveEnabled(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57294yfh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C17111ewd c17111ewdOLrzqt = C17111ewd.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c17111ewdOLrzqt, "");
        this.copydefault = c17111ewdOLrzqt;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setMinHeight(C55298xhM.OLrzqt(72, context2));
        RecyclerView recyclerView = c17111ewdOLrzqt.AEQbTJ;
        final android.content.Context context3 = getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context3) { // from class: com.okinc.wallet.widget.input.address.WalletAddressDataInputLayout$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        RecyclerView recyclerView2 = c17111ewdOLrzqt.AEQbTJ;
        java.util.concurrent.Executor mainExecutor = ContextCompat.getMainExecutor(getContext());
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        recyclerView2.setAdapter(new C57226yeS(mainExecutor, new C57233yeZ.Activity() { // from class: o.yfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.Activity
            public final void EZpvd(int i) {
                C57294yfh.KWHzl(this.AEQbTJ, i);
            }
        }, new C57233yeZ.StateListAnimator() { // from class: o.yfj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.StateListAnimator
            public final boolean copydefault(int i, java.lang.CharSequence charSequence) {
                return C57294yfh.EZpvd(this.copydefault, i, charSequence);
            }
        }, new C57233yeZ.Application() { // from class: o.yfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.Application
            public final void copydefault(int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                C57294yfh.AEQbTJ(this.KWHzl, i, charSequence, charSequence2);
            }
        }, new C57233yeZ.ActionBar() { // from class: o.yfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.ActionBar
            public final boolean copydefault(int i, int i2, android.view.KeyEvent keyEvent, java.lang.String str) {
                return C57294yfh.copydefault(this.KWHzl, i, i2, keyEvent, str);
            }
        }));
        RecyclerView recyclerView3 = c17111ewdOLrzqt.AEQbTJ;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView3.setItemAnimator(defaultItemAnimator);
        c17111ewdOLrzqt.AEQbTJ.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() { // from class: o.yfh.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                pUU.KWHzl("WalletAddressDataInputLayout", "onChildViewDetachedFromWindow: " + view);
            }
        });
        c17111ewdOLrzqt.AEQbTJ.setPreserveFocusAfterLayout(false);
        c17111ewdOLrzqt.KWHzl.setSaveEnabled(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57294yfh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C17111ewd c17111ewdOLrzqt = C17111ewd.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c17111ewdOLrzqt, "");
        this.copydefault = c17111ewdOLrzqt;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setMinHeight(C55298xhM.OLrzqt(72, context2));
        RecyclerView recyclerView = c17111ewdOLrzqt.AEQbTJ;
        final android.content.Context context3 = getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context3) { // from class: com.okinc.wallet.widget.input.address.WalletAddressDataInputLayout$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        RecyclerView recyclerView2 = c17111ewdOLrzqt.AEQbTJ;
        java.util.concurrent.Executor mainExecutor = ContextCompat.getMainExecutor(getContext());
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        recyclerView2.setAdapter(new C57226yeS(mainExecutor, new C57233yeZ.Activity() { // from class: o.yfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.Activity
            public final void EZpvd(int i2) {
                C57294yfh.KWHzl(this.AEQbTJ, i2);
            }
        }, new C57233yeZ.StateListAnimator() { // from class: o.yfj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.StateListAnimator
            public final boolean copydefault(int i2, java.lang.CharSequence charSequence) {
                return C57294yfh.EZpvd(this.copydefault, i2, charSequence);
            }
        }, new C57233yeZ.Application() { // from class: o.yfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.Application
            public final void copydefault(int i2, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                C57294yfh.AEQbTJ(this.KWHzl, i2, charSequence, charSequence2);
            }
        }, new C57233yeZ.ActionBar() { // from class: o.yfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C57233yeZ.ActionBar
            public final boolean copydefault(int i2, int i22, android.view.KeyEvent keyEvent, java.lang.String str) {
                return C57294yfh.copydefault(this.KWHzl, i2, i22, keyEvent, str);
            }
        }));
        RecyclerView recyclerView3 = c17111ewdOLrzqt.AEQbTJ;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView3.setItemAnimator(defaultItemAnimator);
        c17111ewdOLrzqt.AEQbTJ.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() { // from class: o.yfh.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                pUU.KWHzl("WalletAddressDataInputLayout", "onChildViewDetachedFromWindow: " + view);
            }
        });
        c17111ewdOLrzqt.AEQbTJ.setPreserveFocusAfterLayout(false);
        c17111ewdOLrzqt.KWHzl.setSaveEnabled(false);
    }

    public final void setAddressListInvisible(boolean z) {
        RecyclerView recyclerView = this.copydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(z ? 4 : 0);
    }

    public static final void KWHzl(C57294yfh c57294yfh, int i) {
        C57233yeZ.Activity activity = c57294yfh.KWHzl;
        if (activity != null) {
            activity.EZpvd(i);
        }
    }

    public static final boolean EZpvd(C57294yfh c57294yfh, int i, java.lang.CharSequence charSequence) {
        C57233yeZ.StateListAnimator stateListAnimator = c57294yfh.EZpvd;
        if (stateListAnimator != null) {
            return stateListAnimator.copydefault(i, charSequence);
        }
        return false;
    }

    public static final void AEQbTJ(C57294yfh c57294yfh, int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        C57233yeZ.Application application = c57294yfh.valueOf;
        if (application != null) {
            application.copydefault(i, charSequence, charSequence2);
        }
    }

    public static final boolean copydefault(C57294yfh c57294yfh, int i, int i2, android.view.KeyEvent keyEvent, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C57233yeZ.ActionBar actionBar = c57294yfh.OLrzqt;
        if (actionBar != null) {
            return actionBar.copydefault(i, i2, keyEvent, str);
        }
        return false;
    }

    public final void setOnSingleAddressTextChangedListener(final InterfaceC57229yeV interfaceC57229yeV) {
        if (interfaceC57229yeV == null) {
            OKEditText oKEditText = this.copydefault.KWHzl;
            Intrinsics.checkNotNullExpressionValue(oKEditText, "");
            C57223yeP.copydefault(oKEditText, (InterfaceC57229yeV) null);
        } else {
            OKEditText oKEditText2 = this.copydefault.KWHzl;
            Intrinsics.checkNotNullExpressionValue(oKEditText2, "");
            C57223yeP.copydefault(oKEditText2, new InterfaceC57229yeV() { // from class: o.yfn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57229yeV
                public final void AEQbTJ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
                    C57294yfh.setOnSingleAddressTextChangedListener$lambda$5(this.OLrzqt, interfaceC57229yeV, charSequence, charSequence2);
                }
            });
        }
    }

    public static final void setOnSingleAddressTextChangedListener$lambda$5(C57294yfh c57294yfh, InterfaceC57229yeV interfaceC57229yeV, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        OKEditText oKEditText = c57294yfh.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        C57223yeP.AEQbTJ(oKEditText, charSequence);
        interfaceC57229yeV.AEQbTJ(charSequence, charSequence2);
    }

    public final void copydefault(@NotNull C57287yfa c57287yfa, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(c57287yfa, "");
        Intrinsics.checkNotNullParameter(textView, "");
        OKEditText oKEditText = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        C57223yeP.AEQbTJ(oKEditText, c57287yfa.copydefault());
        if (c57287yfa.KWHzl() != -1) {
            this.copydefault.KWHzl.setSelection(c57287yfa.KWHzl());
        }
        if (c57287yfa.EZpvd()) {
            textView.setVisibility(0);
            textView.setText(c57287yfa.AEQbTJ());
            textView.setTextColor(C33070mpX.copydefault(c57287yfa.OLrzqt()));
            return;
        }
        textView.setVisibility(8);
    }

    public static /* synthetic */ void scrollToAddressByIndex$default(C57294yfh c57294yfh, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        c57294yfh.AEQbTJ(i, i2);
    }

    public final void AEQbTJ(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.copydefault.AEQbTJ.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, i2);
    }

    public final void AEQbTJ() {
        OKEditText oKEditText = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        if (oKEditText.getVisibility() == 0) {
            C33570myu.AEQbTJ(this.copydefault.KWHzl.getContext(), (android.widget.EditText) this.copydefault.KWHzl);
            return;
        }
        OKEditText oKEditText2 = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText2, "");
        oKEditText2.setVisibility(0);
        this.copydefault.KWHzl.setAlpha(0.0f);
        OKEditText oKEditText3 = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText3, "");
        C57223yeP.tryRequestFocus$default(oKEditText3, 0, 1, null);
    }

    public final void KWHzl() {
        OKEditText oKEditText = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        oKEditText.setVisibility(8);
    }

    public final void EZpvd() {
        OKEditText oKEditText = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        oKEditText.setVisibility(0);
        this.copydefault.KWHzl.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: o.yfh$ActionBar */
    public static final class ActionBar implements java.lang.Runnable {
        public final /* synthetic */ CancellableContinuation<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.OLrzqt.isActive()) {
                CancellableContinuation<Unit> cancellableContinuation = this.OLrzqt;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }
    }

    public final java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super Unit> continuation) {
        RecyclerView.ItemAnimator itemAnimator = this.copydefault.AEQbTJ.getItemAnimator();
        if (itemAnimator == null) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        StateListAnimator stateListAnimator = new StateListAnimator(cancellableContinuationImpl);
        Application application = new Application(itemAnimator, cancellableContinuationImpl, this, stateListAnimator);
        post(application);
        cancellableContinuationImpl.invokeOnCancellation(new Activity(z, itemAnimator, this, application, stateListAnimator));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.yfh$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public final /* synthetic */ CancellableContinuation<Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.KWHzl = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.KWHzl.isActive()) {
                CancellableContinuation<Unit> cancellableContinuation = this.KWHzl;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }
    }

    /* JADX INFO: renamed from: o.yfh$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application implements java.lang.Runnable {
        public final /* synthetic */ C57294yfh AEQbTJ;
        public final /* synthetic */ CancellableContinuation<Unit> EZpvd;
        public final /* synthetic */ java.lang.Runnable KWHzl;
        public final /* synthetic */ RecyclerView.ItemAnimator OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(RecyclerView.ItemAnimator itemAnimator, CancellableContinuation<? super Unit> cancellableContinuation, C57294yfh c57294yfh, java.lang.Runnable runnable) {
            this.OLrzqt = itemAnimator;
            this.EZpvd = cancellableContinuation;
            this.AEQbTJ = c57294yfh;
            this.KWHzl = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.OLrzqt.isRunning()) {
                RecyclerView.ItemAnimator itemAnimator = this.OLrzqt;
                final C57294yfh c57294yfh = this.AEQbTJ;
                final java.lang.Runnable runnable = this.KWHzl;
                itemAnimator.isRunning(new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: o.yfh.Application.4
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
                    public final void onAnimationsFinished() {
                        c57294yfh.post(runnable);
                    }
                });
                return;
            }
            if (this.EZpvd.isActive()) {
                CancellableContinuation<Unit> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }
    }

    /* JADX INFO: renamed from: o.yfh$Activity */
    public static final class Activity implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ java.lang.Runnable AEQbTJ;
        public final /* synthetic */ java.lang.Runnable EZpvd;
        public final /* synthetic */ RecyclerView.ItemAnimator KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ C57294yfh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(boolean z, RecyclerView.ItemAnimator itemAnimator, C57294yfh c57294yfh, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
            this.OLrzqt = z;
            this.KWHzl = itemAnimator;
            this.copydefault = c57294yfh;
            this.AEQbTJ = runnable;
            this.EZpvd = runnable2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            if (this.OLrzqt) {
                this.KWHzl.endAnimations();
            }
            this.copydefault.removeCallbacks(this.AEQbTJ);
            this.copydefault.removeCallbacks(this.EZpvd);
        }
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<C57227yeT.TaskDescription> list, @NotNull Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        RecyclerView.Adapter adapter = this.copydefault.AEQbTJ.getAdapter();
        C57226yeS c57226yeS = adapter instanceof C57226yeS ? (C57226yeS) adapter : null;
        if (c57226yeS != null) {
            c57226yeS.submitList(list, new ActionBar(cancellableContinuationImpl));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }
}
