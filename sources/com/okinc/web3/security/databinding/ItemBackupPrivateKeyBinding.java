package com.okinc.web3.security.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.web3.security.model.PrivateKeyInfo;
import o.C52794wYp;
import o.C55251xgS;
import o.C57407yho;
import o.C57440yiU;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ItemBackupPrivateKeyBinding extends ViewDataBinding {
    public final Group bottomViewGroup;
    public final ConstraintLayout clContent;
    public final AppCompatImageView ivArrow;
    public final ImageView ivIcon;
    public final ImageView ivMaskEye;
    public final LinearLayoutCompat llMaskTip;

    @Bindable
    protected PrivateKeyInfo mPrivateKeyInfo;
    public final Group maskGroup;
    public final C52794wYp obCopy;
    public final C57440yiU plIconList;
    public final ShapeableImageView sivPrivateKeyProtectMask;
    public final C55251xgS tagAddress;
    public final C55251xgS tagCount;
    public final TextView tvChainName;
    public final TextView tvCoinAddress;
    public final C52794wYp tvCopy;
    public final TextView tvPrivateKey;
    public final TextView tvPrivateKeyTip;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PrivateKeyInfo getPrivateKeyInfo() {
        return this.mPrivateKeyInfo;
    }

    public abstract void setPrivateKeyInfo(@Nullable PrivateKeyInfo privateKeyInfo);

    public ItemBackupPrivateKeyBinding(Object obj, View view, int i, Group group, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, Group group2, C52794wYp c52794wYp, C57440yiU c57440yiU, ShapeableImageView shapeableImageView, C55251xgS c55251xgS, C55251xgS c55251xgS2, TextView textView, TextView textView2, C52794wYp c52794wYp2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.bottomViewGroup = group;
        this.clContent = constraintLayout;
        this.ivArrow = appCompatImageView;
        this.ivIcon = imageView;
        this.ivMaskEye = imageView2;
        this.llMaskTip = linearLayoutCompat;
        this.maskGroup = group2;
        this.obCopy = c52794wYp;
        this.plIconList = c57440yiU;
        this.sivPrivateKeyProtectMask = shapeableImageView;
        this.tagAddress = c55251xgS;
        this.tagCount = c55251xgS2;
        this.tvChainName = textView;
        this.tvCoinAddress = textView2;
        this.tvCopy = c52794wYp2;
        this.tvPrivateKey = textView3;
        this.tvPrivateKeyTip = textView4;
    }

    public static ItemBackupPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemBackupPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ItemBackupPrivateKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.AkhnZx, viewGroup, z, obj);
    }

    public static ItemBackupPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemBackupPrivateKeyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemBackupPrivateKeyBinding) ViewDataBinding.inflateInternal(layoutInflater, C57407yho.StateListAnimator.AkhnZx, null, false, obj);
    }

    public static ItemBackupPrivateKeyBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemBackupPrivateKeyBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ItemBackupPrivateKeyBinding) ViewDataBinding.bind(obj, view, C57407yho.StateListAnimator.AkhnZx);
    }
}
