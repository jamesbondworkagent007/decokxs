package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.web3.security.features.importing.widget.CollisionCell;
import o.C57407yho;

/* JADX INFO: loaded from: classes24.dex */
public final class BottomSheetCollisionBinding implements ViewBinding {
    public final CollisionCell mulitChainSelect;
    private final ConstraintLayout rootView;
    public final TextView tip;
    public final TextView title;
    public final CollisionCell tonChainSelect;
    public final ImageView topImg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private BottomSheetCollisionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CollisionCell collisionCell, @NonNull TextView textView, @NonNull TextView textView2, @NonNull CollisionCell collisionCell2, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.mulitChainSelect = collisionCell;
        this.tip = textView;
        this.title = textView2;
        this.tonChainSelect = collisionCell2;
        this.topImg = imageView;
    }

    public static BottomSheetCollisionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BottomSheetCollisionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C57407yho.StateListAnimator.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static BottomSheetCollisionBinding bind(@NonNull View view) {
        int i = C57407yho.Application.RJOkX;
        CollisionCell collisionCell = (CollisionCell) ViewBindings.findChildViewById(view, i);
        if (collisionCell != null) {
            i = C57407yho.Application.gasjUx;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C57407yho.Application.gGvvIC;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C57407yho.Application.giSNqX;
                    CollisionCell collisionCell2 = (CollisionCell) ViewBindings.findChildViewById(view, i);
                    if (collisionCell2 != null) {
                        i = C57407yho.Application.gkJEwt;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            return new BottomSheetCollisionBinding((ConstraintLayout) view, collisionCell, textView, textView2, collisionCell2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
