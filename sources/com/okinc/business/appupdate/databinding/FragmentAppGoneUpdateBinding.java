package com.okinc.business.appupdate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.appupdate.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentAppGoneUpdateBinding extends ViewDataBinding {

    @Bindable
    protected String mVersion;
    public final TextView updateVersionCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getVersion() {
        return this.mVersion;
    }

    public abstract void setVersion(@Nullable String str);

    public FragmentAppGoneUpdateBinding(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.updateVersionCode = textView;
    }

    public static FragmentAppGoneUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAppGoneUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (FragmentAppGoneUpdateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_app_gone_update, viewGroup, z, obj);
    }

    public static FragmentAppGoneUpdateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAppGoneUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (FragmentAppGoneUpdateBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_app_gone_update, null, false, obj);
    }

    public static FragmentAppGoneUpdateBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentAppGoneUpdateBinding bind(@NonNull View view, @Nullable Object obj) {
        return (FragmentAppGoneUpdateBinding) ViewDataBinding.bind(obj, view, R.layout.fragment_app_gone_update);
    }
}
