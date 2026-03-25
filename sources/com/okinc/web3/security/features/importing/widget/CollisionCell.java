package com.okinc.web3.security.features.importing.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.web3.security.databinding.ItemCollisionBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55296xhK;
import o.C57407yho;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CollisionCell extends ConstraintLayout {
    public static final int $stable = 8;
    private Function1<? super View, Unit> clickListener;
    private final ItemCollisionBinding collisionCellBinding;
    private boolean disable;
    private Function1<? super View, Unit> disableClickListener;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollisionCell(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
    public final Function1<View, Unit> getClickListener() {
        return this.clickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit>, kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> */
    public final Function1<View, Unit> getDisableClickListener() {
        return this.disableClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClickListener(Function1<? super View, Unit> function1) {
        this.clickListener = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisableClickListener(Function1<? super View, Unit> function1) {
        this.disableClickListener = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 android.util.AttributeSet)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: com.okinc.web3.security.features.importing.widget.CollisionCell.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ CollisionCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollisionCell(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C57407yho.StateListAnimator.isConnected, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        ItemCollisionBinding itemCollisionBinding = (ItemCollisionBinding) viewDataBindingInflate;
        this.collisionCellBinding = itemCollisionBinding;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57407yho.TaskDescription.KWHzl);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        String string = typedArrayObtainStyledAttributes.getString(C57407yho.TaskDescription.AEQbTJ);
        String string2 = typedArrayObtainStyledAttributes.getString(C57407yho.TaskDescription.OLrzqt);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C57407yho.TaskDescription.EZpvd);
        itemCollisionBinding.title.setText(string);
        itemCollisionBinding.description.setText(string2);
        itemCollisionBinding.img.setImageDrawable(drawable);
        typedArrayObtainStyledAttributes.recycle();
        final long j = 1000;
        setOnClickListener(new View.OnClickListener() { // from class: com.okinc.web3.security.features.importing.widget.CollisionCell$special$$inlined$singleClick$default$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this) > j || (this instanceof Checkable)) {
                    C55296xhK.OLrzqt(this, jCurrentTimeMillis);
                    if (this.disable) {
                        Function1<View, Unit> disableClickListener = this.getDisableClickListener();
                        if (disableClickListener != null) {
                            disableClickListener.invoke(this);
                            return;
                        }
                        return;
                    }
                    Function1<View, Unit> clickListener = this.getClickListener();
                    if (clickListener != null) {
                        clickListener.invoke(this);
                    }
                }
            }
        });
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.collisionCellBinding.description.setText(str);
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.collisionCellBinding.title.setText(str);
    }

    public final void setStartDrawable(Drawable drawable) {
        this.collisionCellBinding.img.setImageDrawable(drawable);
    }

    public final void disableCell() {
        int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.UlJrfe);
        this.collisionCellBinding.img.getDrawable().setTint(color);
        this.collisionCellBinding.title.setTextColor(color);
        this.collisionCellBinding.description.setTextColor(color);
        this.collisionCellBinding.tag.setVisibility(0);
        this.disable = true;
    }

    public final void setArrow(Drawable drawable) {
        this.collisionCellBinding.arror.setImageDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.disableClickListener = null;
        this.clickListener = null;
    }
}
