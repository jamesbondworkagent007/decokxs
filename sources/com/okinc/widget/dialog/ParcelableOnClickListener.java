package com.okinc.widget.dialog;

import android.os.ResultReceiver;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class ParcelableOnClickListener extends ResultReceiver implements View.OnClickListener {
    public final Function0<Unit> AEQbTJ;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.AEQbTJ.invoke();
    }
}
