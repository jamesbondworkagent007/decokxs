package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22820hma implements InterfaceC22765hlY {
    public final android.content.Context EZpvd;
    public final C55113xdn KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatImageView copydefault;

    @Override // o.InterfaceC22765hlY
    public void isConnected() {
    }

    @Override // o.InterfaceC22765hlY
    public void valueOf() {
    }

    public C22820hma(@NotNull android.content.Context context, @NotNull AppCompatImageView appCompatImageView, @NotNull AppCompatTextView appCompatTextView, @NotNull C55113xdn c55113xdn) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        this.EZpvd = context;
        this.copydefault = appCompatImageView;
        this.OLrzqt = appCompatTextView;
        this.KWHzl = c55113xdn;
    }

    @Override // o.InterfaceC22765hlY
    public void AhwBna() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.PlaybackStateCompatShuffleMode), C52761wXj.Activity.DeEinT);
        KWHzl(this.KWHzl, true);
        this.copydefault.setVisibility(8);
    }

    @Override // o.InterfaceC22765hlY
    public void copydefault() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.dLBcXg), C52761wXj.Activity.DeEinT);
        KWHzl(this.KWHzl, true);
        this.copydefault.setVisibility(8);
    }

    @Override // o.InterfaceC22765hlY
    public void gEmmrt() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.iflRwn), C52761wXj.Activity.DeEinT);
        KWHzl(this.KWHzl, true);
        this.copydefault.setVisibility(8);
    }

    @Override // o.InterfaceC22765hlY
    public void EZpvd() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.DKr), C52761wXj.Activity.DeEinT);
        KWHzl(this.KWHzl, false);
        AEQbTJ(this.copydefault, C23274hvD.ActionBar.QVAiDq, C52761wXj.Activity.DeEinT);
    }

    @Override // o.InterfaceC22765hlY
    public void djBIcL() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.fLIjIY), C52761wXj.Activity.fhUrPt);
        KWHzl(this.KWHzl, false);
        AEQbTJ(this.copydefault, C23274hvD.ActionBar.gasjUx, C52761wXj.Activity.fhUrPt);
    }

    @Override // o.InterfaceC22765hlY
    public void values() {
        AppCompatTextView appCompatTextView = this.OLrzqt;
        java.lang.String string = this.EZpvd.getString(C23274hvD.Fragment.PlaybackStateCompatCustomAction1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AEQbTJ(appCompatTextView, string, C52761wXj.Activity.DeEinT);
        KWHzl(this.KWHzl, false);
        AEQbTJ(this.copydefault, C52761wXj.TaskDescription.Dmq, C52761wXj.Activity.DeEinT);
    }

    @Override // o.InterfaceC22765hlY
    public void fetchVPNInfo() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.DPHsZd), C52761wXj.Activity.DeEinT);
        KWHzl(this.KWHzl, false);
        AEQbTJ(this.copydefault, C52761wXj.TaskDescription.RXzakW, C52761wXj.Activity.DeEinT);
    }

    @Override // o.InterfaceC22765hlY
    public void KWHzl() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.geLlBI), C52761wXj.Activity.DeEinT);
        KWHzl(this.KWHzl, false);
        AEQbTJ(this.copydefault, C23274hvD.ActionBar.iRxXKY, C52761wXj.Activity.DeEinT);
    }

    @Override // o.InterfaceC22765hlY
    public void AYXKKw() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.RvdRAu), C52761wXj.Activity.DeEinT);
        KWHzl(this.KWHzl, true);
        this.copydefault.setVisibility(8);
    }

    @Override // o.InterfaceC22765hlY
    public void OLrzqt() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.iHkeWl), C52761wXj.Activity.fdOvFl);
        KWHzl(this.KWHzl, false);
        AEQbTJ(this.copydefault, C52761wXj.TaskDescription.aWJMta, C52761wXj.Activity.fdOvFl);
    }

    @Override // o.InterfaceC22765hlY
    public void AEQbTJ() {
        AEQbTJ(this.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.RgLUBD), C52761wXj.Activity.fdOvFl);
        KWHzl(this.KWHzl, true);
        this.copydefault.setVisibility(8);
    }

    public final void KWHzl(C55113xdn c55113xdn, boolean z) {
        if (z) {
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
        } else {
            c55113xdn.copydefault();
        }
    }

    public final void AEQbTJ(AppCompatImageView appCompatImageView, int i, int i2) {
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(this.EZpvd, i2)));
        appCompatImageView.setImageResource(i);
    }

    public final void AEQbTJ(AppCompatTextView appCompatTextView, java.lang.String str, int i) {
        appCompatTextView.setTextColor(C25382ivf.KWHzl(this.EZpvd, i));
        appCompatTextView.setText(str);
    }
}
