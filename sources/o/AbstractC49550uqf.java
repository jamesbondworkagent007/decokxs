package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC49550uqf extends AbstractC57674ymq {
    public AbstractC49567uqw copydefault;

    @Override // o.AbstractC57674ymq
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC49567uqw abstractC49567uqw = null;
        AbstractC49567uqw abstractC49567uqw2 = (AbstractC49567uqw) DataBindingUtil.inflate(layoutInflater, C49511upt.StateListAnimator.OLrzqt, null, false);
        this.copydefault = abstractC49567uqw2;
        if (abstractC49567uqw2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49567uqw = abstractC49567uqw2;
        }
        return abstractC49567uqw.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC49567uqw abstractC49567uqw = this.copydefault;
        if (abstractC49567uqw == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw = null;
        }
        abstractC49567uqw.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.uqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                AbstractC49550uqf.EZpvd(this.OLrzqt, view2);
            }
        });
    }

    public static final void EZpvd(AbstractC49550uqf abstractC49550uqf, android.view.View view) {
        abstractC49550uqf.dismissAllowingStateLoss();
    }

    public final void OLrzqt(java.lang.String str) {
        AbstractC49567uqw abstractC49567uqw = this.copydefault;
        if (abstractC49567uqw == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw = null;
        }
        abstractC49567uqw.AYXKKw.setText(str);
    }

    public final void EZpvd(java.lang.String str) {
        AbstractC49567uqw abstractC49567uqw = this.copydefault;
        if (abstractC49567uqw == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw = null;
        }
        abstractC49567uqw.djBIcL.setText(str);
    }

    public static /* synthetic */ void setSecondTitleBgColor$default(AbstractC49550uqf abstractC49550uqf, int i, boolean z, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSecondTitleBgColor");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        abstractC49550uqf.KWHzl(i, z);
    }

    public final void KWHzl(int i, boolean z) {
        AbstractC49567uqw abstractC49567uqw = this.copydefault;
        android.content.res.ColorStateList colorStateListValueOf = null;
        if (abstractC49567uqw == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw = null;
        }
        android.widget.TextView textView = abstractC49567uqw.fetchVPNInfo;
        if (z) {
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        } else {
            android.content.Context context = getContext();
            if (context != null) {
                colorStateListValueOf = android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, i));
            }
        }
        textView.setBackgroundTintList(colorStateListValueOf);
    }

    public static /* synthetic */ void setThirdTitleBgColor$default(AbstractC49550uqf abstractC49550uqf, int i, boolean z, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setThirdTitleBgColor");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        abstractC49550uqf.copydefault(i, z);
    }

    public final void copydefault(int i, boolean z) {
        AbstractC49567uqw abstractC49567uqw = this.copydefault;
        android.content.res.ColorStateList colorStateListValueOf = null;
        if (abstractC49567uqw == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw = null;
        }
        android.widget.TextView textView = abstractC49567uqw.ejfBZ;
        if (z) {
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        } else {
            android.content.Context context = getContext();
            if (context != null) {
                colorStateListValueOf = android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, i));
            }
        }
        textView.setBackgroundTintList(colorStateListValueOf);
    }

    public static /* synthetic */ void setSunNameBgColor$default(AbstractC49550uqf abstractC49550uqf, int i, boolean z, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSunNameBgColor");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        abstractC49550uqf.AEQbTJ(i, z);
    }

    public final void AEQbTJ(int i, boolean z) {
        AbstractC49567uqw abstractC49567uqw = this.copydefault;
        android.content.res.ColorStateList colorStateListValueOf = null;
        if (abstractC49567uqw == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw = null;
        }
        android.widget.TextView textView = abstractC49567uqw.valueOf;
        if (z) {
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        } else {
            android.content.Context context = getContext();
            if (context != null) {
                colorStateListValueOf = android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, i));
            }
        }
        textView.setBackgroundTintList(colorStateListValueOf);
    }

    public static /* synthetic */ void setReminder$default(AbstractC49550uqf abstractC49550uqf, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setReminder");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        abstractC49550uqf.KWHzl(str, str2, num, num2, z);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, @androidx.annotation.ColorInt java.lang.Integer num, @androidx.annotation.ColorInt java.lang.Integer num2, boolean z) {
        AbstractC49567uqw abstractC49567uqw = null;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            AbstractC49567uqw abstractC49567uqw2 = this.copydefault;
            if (abstractC49567uqw2 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw2 = null;
            }
            abstractC49567uqw2.copydefault.setVisibility(8);
        } else {
            AbstractC49567uqw abstractC49567uqw3 = this.copydefault;
            if (abstractC49567uqw3 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw3 = null;
            }
            abstractC49567uqw3.copydefault.setVisibility(0);
        }
        if (z) {
            AbstractC49567uqw abstractC49567uqw4 = this.copydefault;
            if (abstractC49567uqw4 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw4 = null;
            }
            abstractC49567uqw4.KWHzl.setVisibility(0);
            AbstractC49567uqw abstractC49567uqw5 = this.copydefault;
            if (abstractC49567uqw5 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw5 = null;
            }
            abstractC49567uqw5.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.uqe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC49550uqf.AEQbTJ(this.OLrzqt, view);
                }
            });
        } else {
            AbstractC49567uqw abstractC49567uqw6 = this.copydefault;
            if (abstractC49567uqw6 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw6 = null;
            }
            abstractC49567uqw6.KWHzl.setVisibility(8);
            AbstractC49567uqw abstractC49567uqw7 = this.copydefault;
            if (abstractC49567uqw7 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw7 = null;
            }
            abstractC49567uqw7.KWHzl.setOnClickListener(null);
        }
        AbstractC49567uqw abstractC49567uqw8 = this.copydefault;
        if (abstractC49567uqw8 == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw8 = null;
        }
        abstractC49567uqw8.AEQbTJ.setText(str);
        if (str == null || str.length() == 0) {
            AbstractC49567uqw abstractC49567uqw9 = this.copydefault;
            if (abstractC49567uqw9 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw9 = null;
            }
            abstractC49567uqw9.AEQbTJ.setVisibility(8);
        } else {
            AbstractC49567uqw abstractC49567uqw10 = this.copydefault;
            if (abstractC49567uqw10 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw10 = null;
            }
            abstractC49567uqw10.AEQbTJ.setVisibility(0);
        }
        AbstractC49567uqw abstractC49567uqw11 = this.copydefault;
        if (abstractC49567uqw11 == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw11 = null;
        }
        abstractC49567uqw11.OLrzqt.setText(str2);
        if (num != null) {
            AbstractC49567uqw abstractC49567uqw12 = this.copydefault;
            if (abstractC49567uqw12 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw12 = null;
            }
            abstractC49567uqw12.copydefault.setBackgroundColor(num.intValue());
        }
        if (num2 != null) {
            AbstractC49567uqw abstractC49567uqw13 = this.copydefault;
            if (abstractC49567uqw13 == null) {
                Intrinsics.gEmmrt("");
                abstractC49567uqw13 = null;
            }
            abstractC49567uqw13.AEQbTJ.setTextColor(num2.intValue());
            AbstractC49567uqw abstractC49567uqw14 = this.copydefault;
            if (abstractC49567uqw14 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC49567uqw = abstractC49567uqw14;
            }
            abstractC49567uqw.OLrzqt.setTextColor(num2.intValue());
        }
    }

    public static final void AEQbTJ(AbstractC49550uqf abstractC49550uqf, android.view.View view) {
        AbstractC49567uqw abstractC49567uqw = abstractC49550uqf.copydefault;
        if (abstractC49567uqw == null) {
            Intrinsics.gEmmrt("");
            abstractC49567uqw = null;
        }
        abstractC49567uqw.copydefault.setVisibility(8);
    }
}
