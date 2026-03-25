package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C57230yeW;
import o.InterfaceC9730bbB;
import o.InterfaceC9736bbH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ViewOnClickListenerC18449fic extends AbstractC14668dpm implements View.OnClickListener {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public AbstractC16502elD AEQbTJ;
    public boolean AhwBna;
    public java.lang.String AkhnZx;
    public int DbNXlk;
    public InterfaceC9736bbH EZpvd;
    public InterfaceC9730bbB KWHzl;
    public final ActionBar copydefault = new ActionBar();
    public boolean valueOf;

    /* JADX INFO: renamed from: o.fic$ActionBar */
    public static final class ActionBar extends C57230yeW.Application {
        public ActionBar() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            AbstractC16502elD abstractC16502elD = ViewOnClickListenerC18449fic.this.AEQbTJ;
            AbstractC16502elD abstractC16502elD2 = null;
            if (abstractC16502elD == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD = null;
            }
            if (abstractC16502elD.AEQbTJ.getVisibility() == 0) {
                boolean z = false;
                boolean z2 = str == null || str.length() == 0;
                boolean zAEQbTJ = C33129mqd.AEQbTJ(ViewOnClickListenerC18449fic.this.AkhnZx, java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
                boolean z3 = C33129mqd.AEQbTJ(str) <= AudioStats.AUDIO_AMPLITUDE_NONE;
                AbstractC16502elD abstractC16502elD3 = ViewOnClickListenerC18449fic.this.AEQbTJ;
                if (abstractC16502elD3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16502elD3 = null;
                }
                C52794wYp c52794wYp = abstractC16502elD3.djBIcL;
                if (z2) {
                    AbstractC16502elD abstractC16502elD4 = ViewOnClickListenerC18449fic.this.AEQbTJ;
                    if (abstractC16502elD4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16502elD4 = null;
                    }
                    abstractC16502elD4.copydefault.setBackgroundResource(C13754dXa.Activity.uzCIH);
                    ViewOnClickListenerC18449fic.setCustomAmtTip$default(ViewOnClickListenerC18449fic.this, false, null, 2, null);
                } else if (C33129mqd.gEmmrt(str, ViewOnClickListenerC18449fic.this.AkhnZx) && zAEQbTJ) {
                    AbstractC16502elD abstractC16502elD5 = ViewOnClickListenerC18449fic.this.AEQbTJ;
                    if (abstractC16502elD5 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16502elD5 = null;
                    }
                    abstractC16502elD5.copydefault.setBackgroundResource(C13754dXa.Activity.AuCTel);
                    ViewOnClickListenerC18449fic viewOnClickListenerC18449fic = ViewOnClickListenerC18449fic.this;
                    int i = C13754dXa.FragmentManager.ICustomTabsServiceDefault;
                    java.lang.String str2 = viewOnClickListenerC18449fic.AkhnZx;
                    Intrinsics.copydefault((java.lang.Object) str2);
                    viewOnClickListenerC18449fic.KWHzl(true, C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(str2, null, 1, null)))));
                } else if (z3) {
                    AbstractC16502elD abstractC16502elD6 = ViewOnClickListenerC18449fic.this.AEQbTJ;
                    if (abstractC16502elD6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16502elD2 = abstractC16502elD6;
                    }
                    abstractC16502elD2.copydefault.setBackgroundResource(C13754dXa.Activity.AuCTel);
                    ViewOnClickListenerC18449fic.this.KWHzl(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplActionModeCallbackWrapperV9));
                } else {
                    AbstractC16502elD abstractC16502elD7 = ViewOnClickListenerC18449fic.this.AEQbTJ;
                    if (abstractC16502elD7 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16502elD7 = null;
                    }
                    abstractC16502elD7.copydefault.setBackgroundResource(C13754dXa.Activity.iwGUEr);
                    AbstractC16502elD abstractC16502elD8 = ViewOnClickListenerC18449fic.this.AEQbTJ;
                    if (abstractC16502elD8 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16502elD2 = abstractC16502elD8;
                    }
                    abstractC16502elD2.KWHzl.setVisibility(8);
                    z = true;
                }
                c52794wYp.setEnabled(z);
            }
        }
    }

    public static /* synthetic */ void setCustomAmtTip$default(ViewOnClickListenerC18449fic viewOnClickListenerC18449fic, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        viewOnClickListenerC18449fic.KWHzl(z, str);
    }

    public final void KWHzl(boolean z, java.lang.String str) {
        AbstractC16502elD abstractC16502elD = null;
        if (!z) {
            AbstractC16502elD abstractC16502elD2 = this.AEQbTJ;
            if (abstractC16502elD2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16502elD = abstractC16502elD2;
            }
            abstractC16502elD.KWHzl.setVisibility(8);
            return;
        }
        AbstractC16502elD abstractC16502elD3 = this.AEQbTJ;
        if (abstractC16502elD3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD3 = null;
        }
        abstractC16502elD3.KWHzl.setVisibility(0);
        AbstractC16502elD abstractC16502elD4 = this.AEQbTJ;
        if (abstractC16502elD4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD4 = null;
        }
        abstractC16502elD4.KWHzl.setText(str);
        AbstractC16502elD abstractC16502elD5 = this.AEQbTJ;
        if (abstractC16502elD5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16502elD = abstractC16502elD5;
        }
        abstractC16502elD.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fhUrPt));
    }

    /* JADX INFO: renamed from: o.fic$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fic.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final ViewOnClickListenerC18449fic AEQbTJ(@NotNull InterfaceC9730bbB interfaceC9730bbB, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC9730bbB, "");
            ViewOnClickListenerC18449fic viewOnClickListenerC18449fic = new ViewOnClickListenerC18449fic();
            viewOnClickListenerC18449fic.KWHzl = interfaceC9730bbB;
            viewOnClickListenerC18449fic.valueOf = false;
            viewOnClickListenerC18449fic.AhwBna = z;
            return viewOnClickListenerC18449fic;
        }

        public final ViewOnClickListenerC18449fic KWHzl(@NotNull InterfaceC9736bbH interfaceC9736bbH, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC9736bbH, "");
            ViewOnClickListenerC18449fic viewOnClickListenerC18449fic = new ViewOnClickListenerC18449fic();
            viewOnClickListenerC18449fic.EZpvd = interfaceC9736bbH;
            viewOnClickListenerC18449fic.valueOf = false;
            viewOnClickListenerC18449fic.AhwBna = z;
            return viewOnClickListenerC18449fic;
        }

        public static /* synthetic */ ViewOnClickListenerC18449fic newInstance$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
            if ((i2 & 8) != 0) {
                str3 = null;
            }
            return application.AEQbTJ(str, str2, i, str3);
        }

        public final ViewOnClickListenerC18449fic AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ViewOnClickListenerC18449fic viewOnClickListenerC18449fic = new ViewOnClickListenerC18449fic();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("approve_amount", str);
            bundle.putString("symbol", str2);
            bundle.putInt("precision", i);
            bundle.putString("min_approve_amt", str3);
            viewOnClickListenerC18449fic.setArguments(bundle);
            viewOnClickListenerC18449fic.valueOf = true;
            return viewOnClickListenerC18449fic;
        }
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.AEQbTJ = (AbstractC16502elD) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.zhUgOk, viewGroup, false);
        EZpvd(this.valueOf);
        OLrzqt(true);
        AbstractC16502elD abstractC16502elD = this.AEQbTJ;
        if (abstractC16502elD == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD = null;
        }
        android.view.View root = abstractC16502elD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    @Override // o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        InterfaceC9730bbB interfaceC9730bbB;
        java.lang.String approveAmount$default;
        InterfaceC9736bbH interfaceC9736bbH;
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd;
        java.lang.String strAYXKKw;
        InterfaceC9730bbB.StateListAnimator stateListAnimatorCopydefault;
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd2;
        java.lang.Integer numValueOf;
        InterfaceC9730bbB.StateListAnimator stateListAnimatorCopydefault2;
        InterfaceC9736bbH interfaceC9736bbH2;
        InterfaceC9730bbB.StateListAnimator stateListAnimatorCopydefault3;
        java.lang.String strOLrzqt;
        android.os.Bundle arguments;
        android.os.Bundle arguments2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC16502elD abstractC16502elD = null;
        java.lang.String str = (!this.valueOf ? !(!this.AhwBna ? !((interfaceC9730bbB = this.KWHzl) == null || (approveAmount$default = InterfaceC9730bbB.Application.getApproveAmount$default(interfaceC9730bbB, false, 1, null)) == null) : !((interfaceC9736bbH = this.EZpvd) == null || (approveAmount$default = InterfaceC9736bbH.StateListAnimator.getApproveAmount$default(interfaceC9736bbH, 0, false, 2, null)) == null)) : !((arguments2 = getArguments()) == null || (approveAmount$default = arguments2.getString("approve_amount")) == null)) ? "" : approveAmount$default;
        if (this.valueOf) {
            android.os.Bundle arguments3 = getArguments();
            strAYXKKw = arguments3 != null ? arguments3.getString("symbol") : null;
        } else if (this.AhwBna) {
            InterfaceC9736bbH interfaceC9736bbH3 = this.EZpvd;
            if (interfaceC9736bbH3 != null && (stateListAnimatorCopydefault = interfaceC9736bbH3.copydefault(0)) != null) {
                strAYXKKw = stateListAnimatorCopydefault.AYXKKw();
            }
        } else {
            InterfaceC9730bbB interfaceC9730bbB2 = this.KWHzl;
            if (interfaceC9730bbB2 != null && (stateListAnimatorEZpvd = interfaceC9730bbB2.EZpvd()) != null) {
                strAYXKKw = stateListAnimatorEZpvd.AYXKKw();
            }
        }
        if (this.valueOf) {
            EZpvd(strAYXKKw == null ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.iqMDAV) : strAYXKKw);
        } else {
            EZpvd(C13754dXa.FragmentManager.iqMDAV);
        }
        if (this.valueOf) {
            android.os.Bundle arguments4 = getArguments();
            numValueOf = arguments4 != null ? java.lang.Integer.valueOf(arguments4.getInt("precision")) : null;
        } else if (this.AhwBna) {
            InterfaceC9736bbH interfaceC9736bbH4 = this.EZpvd;
            if (interfaceC9736bbH4 != null && (stateListAnimatorCopydefault2 = interfaceC9736bbH4.copydefault(0)) != null) {
                numValueOf = java.lang.Integer.valueOf(stateListAnimatorCopydefault2.copydefault());
            }
        } else {
            InterfaceC9730bbB interfaceC9730bbB3 = this.KWHzl;
            if (interfaceC9730bbB3 != null && (stateListAnimatorEZpvd2 = interfaceC9730bbB3.EZpvd()) != null) {
                numValueOf = java.lang.Integer.valueOf(stateListAnimatorEZpvd2.copydefault());
            }
        }
        this.DbNXlk = ((numValueOf != null && numValueOf.intValue() == 0) || numValueOf == null) ? 18 : numValueOf.intValue();
        this.AkhnZx = C54862xYb.convertToString$default(C54862xYb.divB$default((!this.valueOf ? !(!this.AhwBna || (interfaceC9736bbH2 = this.EZpvd) == null || (stateListAnimatorCopydefault3 = interfaceC9736bbH2.copydefault(0)) == null || (strOLrzqt = stateListAnimatorCopydefault3.OLrzqt()) == null) : !((arguments = getArguments()) == null || (strOLrzqt = arguments.getString("min_approve_amt")) == null)) ? "" : strOLrzqt, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.DbNXlk)))), 0, null, 6, null), false, null, null, 7, null);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
            AhwBna(false);
        } else {
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.divB$default(str, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.DbNXlk)))), 0, null, 6, null), false, null, null, 7, null);
            AbstractC16502elD abstractC16502elD2 = this.AEQbTJ;
            if (abstractC16502elD2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD2 = null;
            }
            C57230yeW.setTextWrapper$default(abstractC16502elD2.copydefault, strConvertToString$default, null, 2, null);
            AhwBna(true);
        }
        AbstractC16502elD abstractC16502elD3 = this.AEQbTJ;
        if (abstractC16502elD3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD3 = null;
        }
        abstractC16502elD3.copydefault.setMaxDecimalValue(this.DbNXlk);
        AbstractC16502elD abstractC16502elD4 = this.AEQbTJ;
        if (abstractC16502elD4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD4 = null;
        }
        abstractC16502elD4.AEQbTJ.setText(getString(C13754dXa.FragmentManager.GFUIi) + "(" + strAYXKKw + ")");
        if (C33129mqd.AEQbTJ(this.AkhnZx, java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            AbstractC16502elD abstractC16502elD5 = this.AEQbTJ;
            if (abstractC16502elD5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD5 = null;
            }
            C57230yeW c57230yeW = abstractC16502elD5.copydefault;
            int i = C13754dXa.FragmentManager.ICustomTabsServiceDefault;
            java.lang.String str2 = this.AkhnZx;
            Intrinsics.copydefault((java.lang.Object) str2);
            c57230yeW.setHint(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(str2, null, 1, null)))));
            AbstractC16502elD abstractC16502elD6 = this.AEQbTJ;
            if (abstractC16502elD6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16502elD = abstractC16502elD6;
            }
            abstractC16502elD.copydefault.setHintTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dff));
        }
        EZpvd();
    }

    public final void EZpvd() {
        AbstractC16502elD abstractC16502elD = this.AEQbTJ;
        AbstractC16502elD abstractC16502elD2 = null;
        if (abstractC16502elD == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD = null;
        }
        abstractC16502elD.copydefault.AEQbTJ(this.copydefault);
        AbstractC16502elD abstractC16502elD3 = this.AEQbTJ;
        if (abstractC16502elD3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD3 = null;
        }
        abstractC16502elD3.AYXKKw.setOnClickListener(this);
        AbstractC16502elD abstractC16502elD4 = this.AEQbTJ;
        if (abstractC16502elD4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD4 = null;
        }
        abstractC16502elD4.OLrzqt.setOnClickListener(this);
        AbstractC16502elD abstractC16502elD5 = this.AEQbTJ;
        if (abstractC16502elD5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD5 = null;
        }
        abstractC16502elD5.djBIcL.setOnClickListener(this);
        AbstractC16502elD abstractC16502elD6 = this.AEQbTJ;
        if (abstractC16502elD6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD6 = null;
        }
        abstractC16502elD6.copydefault.setOnClickListener(this);
        AbstractC16502elD abstractC16502elD7 = this.AEQbTJ;
        if (abstractC16502elD7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16502elD2 = abstractC16502elD7;
        }
        abstractC16502elD2.copydefault.setOnKeyListener(new View.OnKeyListener() { // from class: o.fia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
                return ViewOnClickListenerC18449fic.KWHzl(this.KWHzl, view, i, keyEvent);
            }
        });
    }

    public static final boolean KWHzl(ViewOnClickListenerC18449fic viewOnClickListenerC18449fic, android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (i != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        AbstractC16502elD abstractC16502elD = viewOnClickListenerC18449fic.AEQbTJ;
        AbstractC16502elD abstractC16502elD2 = null;
        if (abstractC16502elD == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD = null;
        }
        android.content.Context context = abstractC16502elD.copydefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AbstractC16502elD abstractC16502elD3 = viewOnClickListenerC18449fic.AEQbTJ;
        if (abstractC16502elD3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD3 = null;
        }
        C33054mpH.OLrzqt(context, abstractC16502elD3.copydefault);
        AbstractC16502elD abstractC16502elD4 = viewOnClickListenerC18449fic.AEQbTJ;
        if (abstractC16502elD4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16502elD2 = abstractC16502elD4;
        }
        abstractC16502elD2.copydefault.clearFocus();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String strGEmmrt;
        java.lang.String str;
        AbstractC16502elD abstractC16502elD = null;
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.PluralsRes;
        if (numValueOf != null && numValueOf.intValue() == i) {
            AhwBna(false);
            return;
        }
        int i2 = C13754dXa.ActionBar.dPkBzA;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            AhwBna(true);
            return;
        }
        int i3 = C13754dXa.ActionBar.zEHIKV;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            AbstractC16502elD abstractC16502elD2 = this.AEQbTJ;
            if (abstractC16502elD2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16502elD = abstractC16502elD2;
            }
            abstractC16502elD.copydefault.setBackgroundResource(C13754dXa.Activity.iwGUEr);
            return;
        }
        int i4 = C13754dXa.ActionBar.getAudioAttributes;
        if (numValueOf != null && numValueOf.intValue() == i4) {
            AbstractC16502elD abstractC16502elD3 = this.AEQbTJ;
            if (abstractC16502elD3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD3 = null;
            }
            if (abstractC16502elD3.AYXKKw.isSelected()) {
                strGEmmrt = "115792089237316195423570985008687907853269984665640564039457584007913129639935";
                str = "unlimited";
            } else {
                AbstractC16502elD abstractC16502elD4 = this.AEQbTJ;
                if (abstractC16502elD4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16502elD4 = null;
                }
                if (abstractC16502elD4.OLrzqt.isSelected()) {
                    AbstractC16502elD abstractC16502elD5 = this.AEQbTJ;
                    if (abstractC16502elD5 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16502elD5 = null;
                    }
                    java.lang.String strCopydefault = abstractC16502elD5.copydefault.copydefault();
                    strGEmmrt = C33129mqd.AEQbTJ(strCopydefault) >= AudioStats.AUDIO_AMPLITUDE_NONE ? C33129mqd.gEmmrt(C33129mqd.mulS$default(strCopydefault, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.DbNXlk)))), null, null, null, 14, null)) : "0";
                    str = "custom";
                } else {
                    strGEmmrt = "0";
                    str = null;
                }
            }
            if (this.valueOf) {
                AbstractC16502elD abstractC16502elD6 = this.AEQbTJ;
                if (abstractC16502elD6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16502elD6 = null;
                }
                if (abstractC16502elD6.AYXKKw.isSelected()) {
                    OLrzqt("unlimited");
                } else {
                    AbstractC16502elD abstractC16502elD7 = this.AEQbTJ;
                    if (abstractC16502elD7 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16502elD = abstractC16502elD7;
                    }
                    if (abstractC16502elD.OLrzqt.isSelected()) {
                        OLrzqt("custom");
                    }
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("approve_amount", strGEmmrt);
                intent.putExtra("precision", this.DbNXlk);
                Unit unit = Unit.INSTANCE;
                OLrzqt(-1, intent);
                return;
            }
            if (this.AhwBna) {
                InterfaceC9736bbH interfaceC9736bbH = this.EZpvd;
                if (interfaceC9736bbH != null) {
                    interfaceC9736bbH.copydefault(0, strGEmmrt);
                }
            } else {
                InterfaceC9730bbB interfaceC9730bbB = this.KWHzl;
                if (interfaceC9730bbB != null) {
                    interfaceC9730bbB.EZpvd(strGEmmrt);
                }
            }
            OLrzqt(str);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("change_approve_amt", true);
            AEQbTJ(bundle);
        }
    }

    public final void OLrzqt(final java.lang.String str) {
        if (str != null) {
            C32866mlf.onEvent$default("ApproveConfirmation_Sheet_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fhZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC18449fic.KWHzl(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("approve_amount_edit", str, true));
        return Unit.INSTANCE;
    }

    public final void AhwBna(boolean z) {
        AbstractC16502elD abstractC16502elD = null;
        if (!z) {
            AbstractC16502elD abstractC16502elD2 = this.AEQbTJ;
            if (abstractC16502elD2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD2 = null;
            }
            abstractC16502elD2.AYXKKw.setSelected(true);
            AbstractC16502elD abstractC16502elD3 = this.AEQbTJ;
            if (abstractC16502elD3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD3 = null;
            }
            abstractC16502elD3.OLrzqt.setSelected(false);
            djBIcL(false);
            AbstractC16502elD abstractC16502elD4 = this.AEQbTJ;
            if (abstractC16502elD4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16502elD = abstractC16502elD4;
            }
            abstractC16502elD.djBIcL.setEnabled(true);
            return;
        }
        AbstractC16502elD abstractC16502elD5 = this.AEQbTJ;
        if (abstractC16502elD5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD5 = null;
        }
        abstractC16502elD5.OLrzqt.setSelected(true);
        AbstractC16502elD abstractC16502elD6 = this.AEQbTJ;
        if (abstractC16502elD6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD6 = null;
        }
        abstractC16502elD6.AYXKKw.setSelected(false);
        AbstractC16502elD abstractC16502elD7 = this.AEQbTJ;
        if (abstractC16502elD7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD7 = null;
        }
        djBIcL(abstractC16502elD7.AEQbTJ.getVisibility() == 8);
        AbstractC16502elD abstractC16502elD8 = this.AEQbTJ;
        if (abstractC16502elD8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD8 = null;
        }
        C52794wYp c52794wYp = abstractC16502elD8.djBIcL;
        AbstractC16502elD abstractC16502elD9 = this.AEQbTJ;
        if (abstractC16502elD9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16502elD = abstractC16502elD9;
        }
        java.lang.String strCopydefault = abstractC16502elD.copydefault.copydefault();
        c52794wYp.setEnabled(true ^ (strCopydefault == null || strCopydefault.length() == 0));
    }

    public final void djBIcL(boolean z) {
        AbstractC16502elD abstractC16502elD = null;
        if (!z) {
            AbstractC16502elD abstractC16502elD2 = this.AEQbTJ;
            if (abstractC16502elD2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD2 = null;
            }
            abstractC16502elD2.AEQbTJ.setVisibility(8);
            AbstractC16502elD abstractC16502elD3 = this.AEQbTJ;
            if (abstractC16502elD3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD3 = null;
            }
            abstractC16502elD3.copydefault.setVisibility(8);
            AbstractC16502elD abstractC16502elD4 = this.AEQbTJ;
            if (abstractC16502elD4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16502elD4 = null;
            }
            abstractC16502elD4.EZpvd.setRotation(90.0f);
            AbstractC16502elD abstractC16502elD5 = this.AEQbTJ;
            if (abstractC16502elD5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16502elD = abstractC16502elD5;
            }
            abstractC16502elD.KWHzl.setVisibility(8);
            return;
        }
        AbstractC16502elD abstractC16502elD6 = this.AEQbTJ;
        if (abstractC16502elD6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD6 = null;
        }
        abstractC16502elD6.AEQbTJ.setVisibility(0);
        AbstractC16502elD abstractC16502elD7 = this.AEQbTJ;
        if (abstractC16502elD7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD7 = null;
        }
        abstractC16502elD7.copydefault.setVisibility(0);
        AbstractC16502elD abstractC16502elD8 = this.AEQbTJ;
        if (abstractC16502elD8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD8 = null;
        }
        abstractC16502elD8.EZpvd.setRotation(270.0f);
        AbstractC16502elD abstractC16502elD9 = this.AEQbTJ;
        if (abstractC16502elD9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD9 = null;
        }
        java.lang.String strCopydefault = abstractC16502elD9.copydefault.copydefault();
        if (strCopydefault == null || strCopydefault.length() == 0) {
            setCustomAmtTip$default(this, false, null, 2, null);
            return;
        }
        if (C33129mqd.gEmmrt(strCopydefault, this.AkhnZx)) {
            int i = C13754dXa.FragmentManager.ICustomTabsServiceDefault;
            java.lang.String str = this.AkhnZx;
            Intrinsics.copydefault((java.lang.Object) str);
            KWHzl(true, C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(str, null, 1, null)))));
            return;
        }
        if (C33129mqd.AEQbTJ(strCopydefault) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            KWHzl(true, C33069mpW.copydefault(C13754dXa.FragmentManager.ICustomTabsServiceDefault, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "0"))));
        } else {
            setCustomAmtTip$default(this, false, null, 2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC16502elD abstractC16502elD = this.AEQbTJ;
        if (abstractC16502elD == null) {
            Intrinsics.gEmmrt("");
            abstractC16502elD = null;
        }
        abstractC16502elD.copydefault.EZpvd(this.copydefault);
    }
}
