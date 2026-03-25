package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.gTA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19926gUl extends ConstraintLayout {
    public final C23530hzv AEQbTJ;
    public boolean OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressTextChangedListener(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19926gUl(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C23530hzv c23530hzvKWHzl = C23530hzv.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23530hzvKWHzl, "");
        this.AEQbTJ = c23530hzvKWHzl;
        c23530hzvKWHzl.EZpvd.EZpvd(true);
        C55009xbp c55009xbpFIwbmz = c23530hzvKWHzl.EZpvd.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuWLRA);
            c55009xbpFIwbmz.setPaddingRelative(c55009xbpFIwbmz.getPaddingStart(), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = c55009xbpFIwbmz.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                c55009xbpFIwbmz.setLayoutParams(layoutParams);
                c55009xbpFIwbmz.setMinimumHeight(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AuCTelauCTel));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            ViewGroup.LayoutParams layoutParams2 = c55001xbhAkhnZx.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                c55001xbhAkhnZx.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx2 = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(new StateListAnimator());
        }
        c23530hzvKWHzl.KWHzl.setContentDescription("web3_dex_copytrading_edit_network_selector");
        C55001xbh c55001xbhAkhnZx3 = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setContentDescription("web3_dex_copytrading_edit_address_input");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19926gUl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23530hzv c23530hzvKWHzl = C23530hzv.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23530hzvKWHzl, "");
        this.AEQbTJ = c23530hzvKWHzl;
        c23530hzvKWHzl.EZpvd.EZpvd(true);
        C55009xbp c55009xbpFIwbmz = c23530hzvKWHzl.EZpvd.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuWLRA);
            c55009xbpFIwbmz.setPaddingRelative(c55009xbpFIwbmz.getPaddingStart(), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = c55009xbpFIwbmz.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                c55009xbpFIwbmz.setLayoutParams(layoutParams);
                c55009xbpFIwbmz.setMinimumHeight(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AuCTelauCTel));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            ViewGroup.LayoutParams layoutParams2 = c55001xbhAkhnZx.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                c55001xbhAkhnZx.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx2 = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(new Application());
        }
        c23530hzvKWHzl.KWHzl.setContentDescription("web3_dex_copytrading_edit_network_selector");
        C55001xbh c55001xbhAkhnZx3 = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setContentDescription("web3_dex_copytrading_edit_address_input");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19926gUl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C23530hzv c23530hzvKWHzl = C23530hzv.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23530hzvKWHzl, "");
        this.AEQbTJ = c23530hzvKWHzl;
        c23530hzvKWHzl.EZpvd.EZpvd(true);
        C55009xbp c55009xbpFIwbmz = c23530hzvKWHzl.EZpvd.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuWLRA);
            c55009xbpFIwbmz.setPaddingRelative(c55009xbpFIwbmz.getPaddingStart(), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = c55009xbpFIwbmz.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                c55009xbpFIwbmz.setLayoutParams(layoutParams);
                c55009xbpFIwbmz.setMinimumHeight(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AuCTelauCTel));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            ViewGroup.LayoutParams layoutParams2 = c55001xbhAkhnZx.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                c55001xbhAkhnZx.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx2 = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(new Activity());
        }
        c23530hzvKWHzl.KWHzl.setContentDescription("web3_dex_copytrading_edit_network_selector");
        C55001xbh c55001xbhAkhnZx3 = c23530hzvKWHzl.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setContentDescription("web3_dex_copytrading_edit_address_input");
        }
    }

    public final void setTitle(java.lang.CharSequence charSequence) {
        this.AEQbTJ.AYXKKw.setText(charSequence);
    }

    public final void setChainInfo(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.gEmmrt.setText(charSequence);
        AppCompatImageView appCompatImageView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.AEQbTJ(appCompatImageView, str);
    }

    public final void setOnChainClickListener(Function0<Unit> function0) {
        android.widget.LinearLayout linearLayout = this.AEQbTJ.KWHzl;
        linearLayout.setOnClickListener(new ActionBar(linearLayout, 1000L, function0));
    }

    public final void setAddressInputState(@NotNull gTA gta) {
        Intrinsics.checkNotNullParameter(gta, "");
        if (Intrinsics.EZpvd(gta, gTA.StateListAnimator.OLrzqt)) {
            if (this.OLrzqt) {
                this.AEQbTJ.EZpvd.setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.dbUqJD));
            }
        } else {
            if (gta instanceof gTA.Activity) {
                this.AEQbTJ.EZpvd.setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.GCXiNH));
                return;
            }
            if (Intrinsics.EZpvd(gta, gTA.Application.copydefault)) {
                this.AEQbTJ.EZpvd.setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.gbIfDn));
            } else {
                if (!(gta instanceof gTA.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.AEQbTJ.EZpvd.values();
                setAddress(((gTA.ActionBar) gta).AEQbTJ());
            }
        }
    }

    /* JADX INFO: renamed from: o.gUl$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C19926gUl.this.OLrzqt = true;
            Function1 function1 = C19926gUl.this.copydefault;
            if (function1 != null) {
                java.lang.String string = editable != null ? editable.toString() : null;
                if (string == null) {
                    string = "";
                }
                function1.invoke(string);
            }
        }
    }

    /* JADX INFO: renamed from: o.gUl$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C19926gUl.this.OLrzqt = true;
            Function1 function1 = C19926gUl.this.copydefault;
            if (function1 != null) {
                java.lang.String string = editable != null ? editable.toString() : null;
                if (string == null) {
                    string = "";
                }
                function1.invoke(string);
            }
        }
    }

    /* JADX INFO: renamed from: o.gUl$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C19926gUl.this.OLrzqt = true;
            Function1 function1 = C19926gUl.this.copydefault;
            if (function1 != null) {
                java.lang.String string = editable != null ? editable.toString() : null;
                if (string == null) {
                    string = "";
                }
                function1.invoke(string);
            }
        }
    }

    public final void setAddress(java.lang.CharSequence charSequence) {
        C55001xbh c55001xbhAkhnZx = this.AEQbTJ.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(charSequence);
        }
        C55001xbh c55001xbhAkhnZx2 = this.AEQbTJ.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setSelection(charSequence != null ? charSequence.length() : 0);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.AEQbTJ.KWHzl.setEnabled(z);
        AppCompatImageView appCompatImageView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        this.AEQbTJ.EZpvd.setEnabled(z);
        C55001xbh c55001xbhAkhnZx = this.AEQbTJ.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setEnabled(z);
        }
        this.AEQbTJ.EZpvd.setState(z ? 0 : 3);
    }

    /* JADX INFO: renamed from: o.gUl$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
