package o;

import android.content.DialogInterface;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.app.AlertDialog;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xSa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54699xSa {
    public static final void AEQbTJ(@NotNull xRZ xrz, @NotNull android.content.Context context) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(xrz, "");
        Intrinsics.checkNotNullParameter(context, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Double.valueOf(SPUtils.getDouble("fuzzyMatchNumber", 0.6d)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = java.lang.Double.valueOf(0.6d);
        }
        double dDoubleValue = ((java.lang.Number) objM7377constructorimpl).doubleValue();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Fuzzy Search Sensitivity");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(50, 40, 50, 10);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setGravity(17);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TaskDescription taskDescription = new TaskDescription(textView);
        final android.widget.SeekBar seekBar = new android.widget.SeekBar(context);
        seekBar.setMax(100);
        seekBar.setProgress(yII.EZpvd(dDoubleValue * 100.0d));
        seekBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        seekBar.setOnSeekBarChangeListener(taskDescription);
        taskDescription.onProgressChanged(seekBar, seekBar.getProgress(), false);
        linearLayout.addView(seekBar);
        linearLayout.addView(textView);
        builder.setView(linearLayout);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: o.xSd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                C54699xSa.copydefault(seekBar, dialogInterface, i);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { // from class: o.xSe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                C54699xSa.KWHzl(dialogInterface, i);
            }
        });
        builder.show();
    }

    /* JADX INFO: renamed from: o.xSa$TaskDescription */
    public static final class TaskDescription implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ android.widget.TextView OLrzqt;

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        }

        public TaskDescription(android.widget.TextView textView) {
            this.OLrzqt = textView;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            double d = ((double) i) / 100.0d;
            SPUtils.put("fuzzyMatchNumber", java.lang.Double.valueOf(d));
            this.OLrzqt.setText("全局模糊匹配度 越大要求匹配度越高 当前匹配度：" + d);
        }
    }

    public static final void copydefault(android.widget.SeekBar seekBar, android.content.DialogInterface dialogInterface, int i) {
        SPUtils.put("fuzzyMatchNumber", java.lang.Double.valueOf(((double) seekBar.getProgress()) / 100.0d));
        dialogInterface.dismiss();
    }

    public static final void KWHzl(android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
