package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48864udi;
import o.C43084ric;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC43147rjm extends DialogC33627mzy implements AbstractC48864udi.ActionBar, View.OnClickListener {
    public final android.widget.Button AwvSrB;
    public final android.widget.TextView gHZMYf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC43147rjm(@NotNull android.content.Context context) {
        super(context, 6);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View viewInflate = getLayoutInflater().inflate(C43084ric.Application.OLrzqt, (android.view.ViewGroup) null);
        OLrzqt(viewInflate);
        this.gHZMYf = (android.widget.TextView) viewInflate.findViewById(C43084ric.TaskDescription.fARcdN);
        android.widget.Button button = (android.widget.Button) viewInflate.findViewById(C43084ric.TaskDescription.copydefault);
        this.AwvSrB = button;
        button.setOnClickListener(this);
    }

    public final void EZpvd() {
        AEQbTJ("Downloading...");
    }

    @Override // o.AbstractC48864udi.ActionBar
    public void AEQbTJ(long j, long j2) {
        AEQbTJ("Downloading..." + ((j * ((long) 100)) / j2) + "%");
    }

    @Override // o.AbstractC48864udi.ActionBar
    public void OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        AEQbTJ("Download failed!\n" + th.getMessage());
    }

    @Override // o.AbstractC48864udi.ActionBar
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ("Download success.\nInstall to " + str);
    }

    public final void AEQbTJ(final java.lang.String str) {
        this.gHZMYf.post(new java.lang.Runnable() { // from class: o.rjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC43147rjm.EZpvd(this.copydefault, str);
            }
        });
    }

    public static final void EZpvd(ViewOnClickListenerC43147rjm viewOnClickListenerC43147rjm, java.lang.String str) {
        viewOnClickListenerC43147rjm.gHZMYf.setText(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        dismiss();
    }
}
