package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC41936rAg;
import o.C33070mpX;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class KisaPermissionView extends FrameLayout {
    public final AbstractC41936rAg OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KisaPermissionView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KisaPermissionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: com.okinc.ok_kyc_core.presentation.views.KisaPermissionView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ KisaPermissionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KisaPermissionView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C43662rtX.TaskDescription.QDqgQU, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC41936rAg abstractC41936rAg = (AbstractC41936rAg) viewDataBindingInflate;
        this.OLrzqt = abstractC41936rAg;
        abstractC41936rAg.EZpvd.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.ffGIBT));
        abstractC41936rAg.OLrzqt.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.giSNqX));
    }

    public final void OLrzqt(PermissionItem permissionItem) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(C43662rtX.TaskDescription.DLWbHP, (ViewGroup) this.OLrzqt.copydefault, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(C43662rtX.ActionBar.awiJhF);
        TextView textView = (TextView) viewInflate.findViewById(C43662rtX.ActionBar.DcMfJKfwDlxl);
        TextView textView2 = (TextView) viewInflate.findViewById(C43662rtX.ActionBar.DcMfJKsgNvtZ);
        imageView.setImageResource(permissionItem.getIconRes());
        textView.setText(C33070mpX.AYXKKw(permissionItem.getTitle()));
        textView2.setText(C33070mpX.AYXKKw(permissionItem.getDescription()));
        if (this.OLrzqt.copydefault.getChildCount() == 0) {
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin = 0;
            }
            viewInflate.setLayoutParams(layoutParams2);
        }
        this.OLrzqt.copydefault.addView(viewInflate);
    }

    public final void setPermissions(@NotNull List<PermissionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.copydefault.removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            OLrzqt((PermissionItem) it.next());
        }
    }

    public static final class PermissionItem implements Serializable {
        public static final int $stable = 0;
        private final int description;
        private final int iconRes;
        private final int title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PermissionItem copy$default(PermissionItem permissionItem, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = permissionItem.iconRes;
            }
            if ((i4 & 2) != 0) {
                i2 = permissionItem.title;
            }
            if ((i4 & 4) != 0) {
                i3 = permissionItem.description;
            }
            return permissionItem.copy(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.iconRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component3() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PermissionItem copy(@DrawableRes int i, @StringRes int i2, @StringRes int i3) {
            return new PermissionItem(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PermissionItem)) {
                return false;
            }
            PermissionItem permissionItem = (PermissionItem) obj;
            return this.iconRes == permissionItem.iconRes && this.title == permissionItem.title && this.description == permissionItem.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getIconRes() {
            return this.iconRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Integer.hashCode(this.iconRes) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.description);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PermissionItem(iconRes=" + this.iconRes + ", title=" + this.title + ", description=" + this.description + ")";
        }

        public PermissionItem(@DrawableRes int i, @StringRes int i2, @StringRes int i3) {
            this.iconRes = i;
            this.title = i2;
            this.description = i3;
        }
    }
}
