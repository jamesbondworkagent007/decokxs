package o;

import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10828bvn;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fiH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18428fiH<T extends AbstractC10828bvn> extends AbstractC18451fie<T> {
    public AbstractC16611enG hDKMBd;
    public final int uzCIH = C13754dXa.FragmentManager.aVhqwO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull AbstractC16611enG abstractC16611enG) {
        Intrinsics.checkNotNullParameter(abstractC16611enG, "");
        this.hDKMBd = abstractC16611enG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int ejfBZ() {
        return this.uzCIH;
    }

    public final AbstractC16611enG fARcdN() {
        AbstractC16611enG abstractC16611enG = this.hDKMBd;
        if (abstractC16611enG != null) {
            return abstractC16611enG;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AEQbTJ((AbstractC16611enG) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.invokespecialDaTmkG, viewGroup, false));
        EZpvd(false);
        OLrzqt(true);
        return fARcdN().getRoot();
    }

    @Override // o.AbstractC18451fie
    public void DbNXlk() {
        T tDjBIcL;
        C10854bwM c10854bwMGEmmrt;
        EZpvd(ejfBZ());
        android.content.Context context = getContext();
        if (context == null || (tDjBIcL = djBIcL()) == null || (c10854bwMGEmmrt = tDjBIcL.gEmmrt()) == null) {
            return;
        }
        AbstractC12782ctV abstractC12782ctVFJNWhG = tDjBIcL.fJNWhG();
        AbstractC16962etn abstractC16962etn = fARcdN().djBIcL;
        Intrinsics.checkNotNullExpressionValue(abstractC16962etn, "");
        DappSignArgs dappSignArgsKWHzl = KWHzl();
        EZpvd(context, abstractC16962etn, dappSignArgsKWHzl != null ? dappSignArgsKWHzl.getDapp() : null);
        AbstractC16960etl abstractC16960etl = fARcdN().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(abstractC16960etl, "");
        OLrzqt(abstractC16960etl, tDjBIcL, abstractC12782ctVFJNWhG);
        AbstractC16949eta abstractC16949eta = fARcdN().AhwBna;
        Intrinsics.checkNotNullExpressionValue(abstractC16949eta, "");
        copydefault(abstractC16949eta, tDjBIcL);
        AbstractC16958etj abstractC16958etj = fARcdN().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(abstractC16958etj, "");
        copydefault(context, abstractC16958etj, c10854bwMGEmmrt);
        AuCTel();
        AbstractC16951etc abstractC16951etc = fARcdN().copydefault;
        Intrinsics.checkNotNullExpressionValue(abstractC16951etc, "");
        copydefault(abstractC16951etc, tDjBIcL);
        AbstractC16952etd abstractC16952etd = fARcdN().KWHzl;
        Intrinsics.checkNotNullExpressionValue(abstractC16952etd, "");
        AEQbTJ(abstractC16952etd, abstractC12782ctVFJNWhG, c10854bwMGEmmrt);
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull AbstractC16962etn abstractC16962etn, PlatformItem platformItem) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC16962etn, "");
        abstractC16962etn.djBIcL.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateNightMode));
        java.lang.Object image = platformItem != null ? platformItem.getImage(context) : null;
        if (image == null) {
            Glide.EZpvd(this).AEQbTJ(AppCompatResources.getDrawable(context, C13754dXa.Activity.aKErDB)).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(90))).EZpvd(abstractC16962etn.OLrzqt);
        } else {
            Glide.EZpvd(this).KWHzl(image).AEQbTJ(AppCompatResources.getDrawable(context, C13754dXa.Activity.aKErDB)).OLrzqt(AppCompatResources.getDrawable(context, C13754dXa.Activity.aKErDB)).OLrzqt((RX<?>) C5448Sc.KWHzl((NN<android.graphics.Bitmap>) new C5417Qx(90))).EZpvd(abstractC16962etn.OLrzqt);
        }
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (platformItem != null ? platformItem.getPlatform() : null));
        boolean zOLrzqt2 = C33129mqd.OLrzqt((java.lang.CharSequence) (platformItem != null ? platformItem.getUrl() : null));
        boolean zOLrzqt3 = C33129mqd.OLrzqt((java.lang.CharSequence) (platformItem != null ? platformItem.getContract() : null));
        if (zOLrzqt) {
            abstractC16962etn.AYXKKw.setText(platformItem != null ? platformItem.getPlatform() : null);
            if (zOLrzqt2) {
                abstractC16962etn.gEmmrt.setText(platformItem != null ? platformItem.getUrlWithoutScheme() : null);
            } else if (zOLrzqt3) {
                fARcdN().djBIcL.values.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.tryUnwrapContext) + " " + (platformItem != null ? platformItem.getContract() : null));
            } else {
                abstractC16962etn.gEmmrt.setVisibility(8);
            }
        } else if (zOLrzqt2) {
            abstractC16962etn.AYXKKw.setText(platformItem != null ? platformItem.getUrlWithoutScheme() : null);
            abstractC16962etn.gEmmrt.setVisibility(8);
        } else if (zOLrzqt3) {
            fARcdN().djBIcL.DbNXlk.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.tryUnwrapContext) + " " + (platformItem != null ? platformItem.getContract() : null));
            fARcdN().djBIcL.values.setVisibility(8);
        } else {
            abstractC16962etn.AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.closePanel));
            abstractC16962etn.gEmmrt.setVisibility(8);
        }
        abstractC16962etn.copydefault.setVisibility(8);
        abstractC16962etn.EZpvd.setVisibility(8);
        abstractC16962etn.AkhnZx.setVisibility(8);
        abstractC16962etn.DbNXlk.setVisibility(8);
        abstractC16962etn.fetchVPNInfo.setVisibility(8);
        abstractC16962etn.KWHzl.setVisibility(8);
        abstractC16962etn.isConnected.setVisibility(8);
        abstractC16962etn.values.setVisibility(8);
        abstractC16962etn.AEQbTJ.setVisibility(8);
        abstractC16962etn.AhwBna.setVisibility(8);
    }

    public final void OLrzqt(@NotNull AbstractC16960etl abstractC16960etl, @NotNull final T t, @NotNull final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC16960etl, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        abstractC16960etl.valueOf.setText(C14733dqy.copydefault.KWHzl(abstractC12782ctV));
        abstractC16960etl.gEmmrt.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, t.AhwBna(), false, 2, null));
        C8003auW.copydefault(abstractC16960etl.AhwBna).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fiJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18428fiH.OLrzqt(abstractC12782ctV, this, t, obj);
            }
        });
    }

    public static final void OLrzqt(AbstractC12782ctV abstractC12782ctV, AbstractC18428fiH abstractC18428fiH, AbstractC10828bvn abstractC10828bvn, java.lang.Object obj) {
        if (!abstractC12782ctV.zLjUOn()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPdIKEqB, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        android.content.Context context = abstractC18428fiH.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(abstractC18428fiH.getClass().getName(), abstractC10828bvn.AhwBna()));
        C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.onComplete, 0, 1, (java.lang.Object) null);
    }

    public final void copydefault(@NotNull AbstractC16949eta abstractC16949eta, @NotNull T t) {
        Intrinsics.checkNotNullParameter(abstractC16949eta, "");
        Intrinsics.checkNotNullParameter(t, "");
        final java.lang.String strFIwbmz = t.fIwbmz();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strFIwbmz)) {
            abstractC16949eta.getRoot().setVisibility(0);
            abstractC16949eta.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerSlideAnimationEnabled));
            abstractC16949eta.EZpvd.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, strFIwbmz, false, 2, null));
            C8003auW.copydefault(abstractC16949eta.KWHzl).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fiL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC18428fiH.KWHzl(this.EZpvd, strFIwbmz, obj);
                }
            });
            return;
        }
        abstractC16949eta.getRoot().setVisibility(8);
    }

    public static final void KWHzl(AbstractC18428fiH abstractC18428fiH, java.lang.String str, java.lang.Object obj) {
        android.content.Context context = abstractC18428fiH.getContext();
        java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(abstractC18428fiH.getClass().getName(), str));
        C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.onComplete, 0, 1, (java.lang.Object) null);
    }

    public final void copydefault(@NotNull android.content.Context context, @NotNull AbstractC16958etj abstractC16958etj, @NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(abstractC16958etj, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        abstractC16958etj.KWHzl.setText(c10854bwM.djBIcL());
        Glide.EZpvd(this).EZpvd(c10854bwM.AYXKKw()).OLrzqt(C14726dqr.OLrzqt.OLrzqt(context)).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(context)).EZpvd(abstractC16958etj.copydefault);
    }

    public final void AuCTel() {
        fARcdN().EZpvd.EZpvd.setVisibility(8);
    }

    public final void copydefault(@NotNull final AbstractC16951etc abstractC16951etc, @NotNull T t) {
        Intrinsics.checkNotNullParameter(abstractC16951etc, "");
        Intrinsics.checkNotNullParameter(t, "");
        java.lang.String strFetchVPNInfo = t.fetchVPNInfo();
        if (strFetchVPNInfo.length() == 0) {
            abstractC16951etc.getRoot().setVisibility(8);
            return;
        }
        abstractC16951etc.copydefault.setText(strFetchVPNInfo);
        abstractC16951etc.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.fiD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC18428fiH.EZpvd(abstractC16951etc, view);
            }
        });
        abstractC16951etc.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.fiI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC18428fiH.copydefault(this.AEQbTJ, abstractC16951etc, view);
            }
        });
    }

    public static final void EZpvd(AbstractC16951etc abstractC16951etc, android.view.View view) {
        if (abstractC16951etc.copydefault.getVisibility() == 0) {
            abstractC16951etc.OLrzqt.setRotation(0.0f);
            abstractC16951etc.copydefault.setVisibility(8);
        } else {
            abstractC16951etc.OLrzqt.setRotation(180.0f);
            abstractC16951etc.copydefault.setVisibility(0);
        }
    }

    public static final void copydefault(AbstractC18428fiH abstractC18428fiH, AbstractC16951etc abstractC16951etc, android.view.View view) {
        java.lang.Object systemService = abstractC18428fiH.requireActivity().getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, abstractC16951etc.copydefault.getText()));
        java.lang.String string = abstractC18428fiH.getString(C13754dXa.FragmentManager.setProfilesSinceInitCount);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    public final void AEQbTJ(@NotNull AbstractC16952etd abstractC16952etd, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(abstractC16952etd, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        copydefault(abstractC16952etd, !(abstractC12782ctV.gHZMYf() || abstractC12782ctV.iwGUEr()) || abstractC12782ctV.gEmmrt(c10854bwM.fetchVPNInfo()));
        if (abstractC12782ctV.gHZMYf() || abstractC12782ctV.iwGUEr()) {
            abstractC16952etd.EZpvd.setVisibility(8);
            abstractC16952etd.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRccStateFromState));
            if (!abstractC12782ctV.gEmmrt(c10854bwM.fetchVPNInfo())) {
                C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C13754dXa.FragmentManager.getToken, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainname", c10854bwM.djBIcL()))), 0, 1, (java.lang.Object) null);
            }
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16952etd.KWHzl);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fiG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18428fiH.OLrzqt(this.AEQbTJ, obj);
            }
        });
        C8003auW.copydefault(abstractC16952etd.EZpvd).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fiE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18428fiH.copydefault(this.AEQbTJ, obj);
            }
        });
    }

    public static final void OLrzqt(AbstractC18428fiH abstractC18428fiH, java.lang.Object obj) {
        abstractC18428fiH.AYXKKw();
    }

    public static final void copydefault(AbstractC18428fiH abstractC18428fiH, java.lang.Object obj) {
        abstractC18428fiH.AhwBna();
    }

    public final void copydefault(@NotNull AbstractC16952etd abstractC16952etd, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC16952etd, "");
        abstractC16952etd.KWHzl.setEnabled(z);
    }
}
