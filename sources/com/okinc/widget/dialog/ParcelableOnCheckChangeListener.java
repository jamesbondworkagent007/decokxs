package com.okinc.widget.dialog;

import android.os.ResultReceiver;
import android.widget.CompoundButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class ParcelableOnCheckChangeListener extends ResultReceiver implements CompoundButton.OnCheckedChangeListener {
    public final Function1<Boolean, Unit> EZpvd;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.EZpvd.invoke(Boolean.valueOf(z));
    }
}
