package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.tEF;
import o.tEH;
import o.tRU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tEH extends androidx.recyclerview.widget.ListAdapter<tEF, RecyclerView.ViewHolder> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final Function0<Unit> AEQbTJ;
    public final Function1<tEF.StateListAnimator, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.tEF$StateListAnimator, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tEH(@NotNull Function1<? super tEF.StateListAnimator, Unit> function1, @NotNull Function0<Unit> function0) {
        super(tEP.copydefault);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function1;
        this.AEQbTJ = function0;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tEH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 0) {
            C46279tOl c46279tOlCopydefault = C46279tOl.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c46279tOlCopydefault, "");
            return new ActionBar(c46279tOlCopydefault, this.KWHzl);
        }
        if (i == 1) {
            C46281tOn c46281tOnAEQbTJ = C46281tOn.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c46281tOnAEQbTJ, "");
            return new StateListAnimator(c46281tOnAEQbTJ, this.AEQbTJ);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        tEF item = getItem(i);
        if (item instanceof tEF.StateListAnimator) {
            return 0;
        }
        if (item instanceof tEF.TaskDescription) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        tEF item = getItem(i);
        if (item instanceof tEF.StateListAnimator) {
            ((ActionBar) viewHolder).KWHzl((tEF.StateListAnimator) item);
        } else if (!Intrinsics.EZpvd(item, tEF.TaskDescription.AEQbTJ)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final Function0<Unit> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C46281tOn c46281tOn, @NotNull Function0<Unit> function0) {
            super(c46281tOn.getRoot());
            Intrinsics.checkNotNullParameter(c46281tOn, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.KWHzl = function0;
            c46281tOn.AEQbTJ.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
            wYE wye = c46281tOn.AEQbTJ;
            wye.setOnClickListener(new Application(wye, 300L, wye, this));
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, android.view.View view2, StateListAnimator stateListAnimator) {
                this.OLrzqt = view;
                this.EZpvd = j;
                this.AEQbTJ = view2;
                this.copydefault = stateListAnimator;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.copydefault.KWHzl.invoke();
                }
            }
        }
    }

    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C46279tOl KWHzl;
        public final Function1<tEF.StateListAnimator, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.tEF$StateListAnimator, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C46279tOl c46279tOl, @NotNull Function1<? super tEF.StateListAnimator, Unit> function1) {
            super(c46279tOl.getRoot());
            Intrinsics.checkNotNullParameter(c46279tOl, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = c46279tOl;
            this.OLrzqt = function1;
            c46279tOl.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }

        public final void KWHzl(@NotNull final tEF.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            this.KWHzl.OLrzqt.setText(copydefault(stateListAnimator, new Function0() { // from class: o.tEK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return tEH.ActionBar.AEQbTJ(this.EZpvd, stateListAnimator);
                }
            }));
            this.KWHzl.KWHzl.setText(stateListAnimator.AYXKKw());
            this.KWHzl.AEQbTJ.setText(stateListAnimator.isConnected());
            if (stateListAnimator.DbNXlk() instanceof tRU.ActionBar) {
                this.KWHzl.AEQbTJ.setOKDSStyle(14);
            } else {
                this.KWHzl.AEQbTJ.setOKDSStyle(13);
            }
        }

        public static final Unit AEQbTJ(ActionBar actionBar, tEF.StateListAnimator stateListAnimator) {
            actionBar.OLrzqt.invoke(stateListAnimator);
            return Unit.INSTANCE;
        }

        public final java.lang.CharSequence copydefault(tEF.StateListAnimator stateListAnimator, Function0<Unit> function0) {
            android.text.SpannableString spannableString = new android.text.SpannableString(C33069mpW.OLrzqt(stateListAnimator.OLrzqt(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.SIDE, stateListAnimator.isConnected()), C56390yDp.OLrzqt("pair", stateListAnimator.KWHzl()), C56390yDp.OLrzqt("pairLeverage", stateListAnimator.KWHzl()), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, stateListAnimator.valueOf()), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, stateListAnimator.gEmmrt()), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, stateListAnimator.djBIcL()))));
            java.util.Iterator it = yDY.gEmmrt(stateListAnimator.KWHzl(), stateListAnimator.gEmmrt(), stateListAnimator.djBIcL(), stateListAnimator.valueOf()).iterator();
            while (it.hasNext()) {
                AEQbTJ(spannableString, (java.lang.String) it.next());
            }
            KWHzl(spannableString, stateListAnimator.AEQbTJ(), function0);
            return spannableString;
        }

        public final void AEQbTJ(android.text.SpannableString spannableString, java.lang.String str) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, str, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default != -1) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), iIndexOf$default, str.length() + iIndexOf$default, 33);
            }
            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableString, str, 0, false, 6, (java.lang.Object) null);
            if (iLastIndexOf$default != -1) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), iLastIndexOf$default, str.length() + iLastIndexOf$default, 33);
            }
        }

        public final void KWHzl(android.text.SpannableString spannableString, java.lang.String str, Function0<Unit> function0) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableString, str, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default != -1) {
                spannableString.setSpan(new Activity(function0), iIndexOf$default, str.length() + iIndexOf$default, 33);
            }
        }

        public static final class Activity extends android.text.style.ClickableSpan {
            public final /* synthetic */ Function0<Unit> KWHzl;

            public Activity(Function0<Unit> function0) {
                this.KWHzl = function0;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                this.KWHzl.invoke();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(android.text.TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "");
                textPaint.setUnderlineText(true);
            }
        }
    }
}
