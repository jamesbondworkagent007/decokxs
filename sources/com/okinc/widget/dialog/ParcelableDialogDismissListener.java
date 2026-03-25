package com.okinc.widget.dialog;

import android.content.DialogInterface;
import android.os.ResultReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class ParcelableDialogDismissListener extends ResultReceiver implements DialogInterface.OnDismissListener {
    public final Function0<Unit> AEQbTJ;

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.AEQbTJ.invoke();
    }
}
