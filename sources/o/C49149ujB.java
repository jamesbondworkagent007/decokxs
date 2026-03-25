package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.share.api.RedirectBehavior;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareFooterDecodeInfo;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.view.FootViewTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48894ueL;
import o.C48931uew;
import o.C49149ujB;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ujB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49149ujB extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public C49017ugc OLrzqt;
    public final int KWHzl = C48931uew.Application.AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ujM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49149ujB.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.ujB$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ujB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C49149ujB OLrzqt() {
            android.os.Bundle bundle = new android.os.Bundle();
            C49149ujB c49149ujB = new C49149ujB();
            c49149ujB.setArguments(bundle);
            return c49149ujB;
        }
    }

    private final InterfaceC48893ueK AEQbTJ() {
        return (InterfaceC48893ueK) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC48893ueK EZpvd() {
        return (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
    }

    /* JADX INFO: renamed from: o.ujB$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC48970ufi {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC48970ufi
        public void KWHzl(C48972ufk c48972ufk, Function1<? super MultiShareConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(c48972ufk, "");
            Intrinsics.checkNotNullParameter(function1, "");
            LinkShareParams linkShareParamsAEQbTJ = LinkShareParams.Companion.AEQbTJ("https://www.okx.com/ul/ocGWa8j", new Function1() { // from class: o.ukb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49149ujB.StateListAnimator.OLrzqt((LinkShareParams) obj);
                }
            });
            ShareConfig.ActionBar actionBar = ShareConfig.Companion;
            final C49149ujB c49149ujB = C49149ujB.this;
            function1.invoke(MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, C56402yEa.EZpvd(actionBar.copydefault(linkShareParamsAEQbTJ, new Function1() { // from class: o.ujZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49149ujB.StateListAnimator.OLrzqt(c49149ujB, (ShareConfig) obj);
                }
            })), false, 0.0f, false, null, null, 62, null));
        }

        public static final Unit OLrzqt(LinkShareParams linkShareParams) {
            Intrinsics.checkNotNullParameter(linkShareParams, "");
            linkShareParams.setShareFrom("test");
            linkShareParams.setBody("share body,please join us by click the url -> https://www.okx.com/ul/ocGWa8j");
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(final C49149ujB c49149ujB, ShareConfig shareConfig) {
            Intrinsics.checkNotNullParameter(shareConfig, "");
            shareConfig.setPreviewConfig(LinkDefaultPreviewConfig.Activity.create$default(LinkDefaultPreviewConfig.Companion, "title", "https://www.okx.com/ul/ocGWa8j", null, C33061mpO.setupSpanStyles$default("hello123world", new java.lang.String[]{"123"}, 0, null, false, new Function1() { // from class: o.uka
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49149ujB.StateListAnimator.OLrzqt(c49149ujB, (java.util.List) obj);
                }
            }, 14, null), ImageSource.Companion.OLrzqt("https://static.coinall.ltd/cdn/assets/imgs/244/84D446EF6A65AF94.jpeg"), null, 32, null));
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(C49149ujB c49149ujB, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.ForegroundColorSpan(c49149ujB.getResources().getColor(C52761wXj.Activity.iqeXgQ)));
            list.add(new android.text.style.TextAppearanceSpan(c49149ujB.requireContext(), C52761wXj.PictureInPictureParams.ORrpqH));
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C49017ugc c49017ugcAEQbTJ = C49017ugc.AEQbTJ(view);
        Intrinsics.copydefault(c49017ugcAEQbTJ);
        this.OLrzqt = c49017ugcAEQbTJ;
        AEQbTJ().KWHzl(this, new StateListAnimator());
        C49017ugc c49017ugc = this.OLrzqt;
        C49017ugc c49017ugc2 = null;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        c49017ugc.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.ujX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49149ujB.copydefault(this.AEQbTJ, view2);
            }
        });
        C49017ugc c49017ugc3 = this.OLrzqt;
        if (c49017ugc3 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc3 = null;
        }
        c49017ugc3.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.ujU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49149ujB.djBIcL(this.AEQbTJ, view2);
            }
        });
        final java.lang.String strDjBIcL = AEQbTJ().DTwDnp().djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        C49017ugc c49017ugc4 = this.OLrzqt;
        if (c49017ugc4 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc4 = null;
        }
        c49017ugc4.gEmmrt.setText(strDjBIcL);
        C49017ugc c49017ugc5 = this.OLrzqt;
        if (c49017ugc5 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc5 = null;
        }
        c49017ugc5.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.ujW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49149ujB.EZpvd(this.KWHzl, strDjBIcL, view2);
            }
        });
        C49017ugc c49017ugc6 = this.OLrzqt;
        if (c49017ugc6 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc6 = null;
        }
        c49017ugc6.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.ujz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49149ujB.KWHzl(this.OLrzqt, strDjBIcL, view2);
            }
        });
        C49017ugc c49017ugc7 = this.OLrzqt;
        if (c49017ugc7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49017ugc2 = c49017ugc7;
        }
        c49017ugc2.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.ujA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49149ujB.OLrzqt(this.AEQbTJ, view2);
            }
        });
    }

    public static final void copydefault(C49149ujB c49149ujB, android.view.View view) {
        C49017ugc c49017ugc = c49149ujB.OLrzqt;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        android.widget.LinearLayout linearLayout = c49017ugc.fARcdN;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        c49149ujB.copydefault(linearLayout);
    }

    public static final void djBIcL(C49149ujB c49149ujB, android.view.View view) {
        C49017ugc c49017ugc = c49149ujB.OLrzqt;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        c49149ujB.OLrzqt(java.lang.String.valueOf(c49017ugc.values.getText()));
    }

    public static final void EZpvd(C49149ujB c49149ujB, java.lang.String str, android.view.View view) {
        C49017ugc c49017ugc = c49149ujB.OLrzqt;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        android.text.Editable text = c49017ugc.gEmmrt.getText();
        java.lang.String string = text != null ? text.toString() : null;
        c49149ujB.KWHzl(string != null ? string : "", str);
    }

    public static final void KWHzl(C49149ujB c49149ujB, java.lang.String str, android.view.View view) {
        C49017ugc c49017ugc = c49149ujB.OLrzqt;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        android.text.Editable text = c49017ugc.gEmmrt.getText();
        java.lang.String string = text != null ? text.toString() : null;
        c49149ujB.copydefault(string != null ? string : "", str);
    }

    public static final void OLrzqt(final C49149ujB c49149ujB, android.view.View view) {
        C49017ugc c49017ugc = c49149ujB.OLrzqt;
        C49017ugc c49017ugc2 = null;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        android.text.Editable text = c49017ugc.AYXKKw.getText();
        java.lang.String string = text != null ? text.toString() : null;
        if (string == null || string.length() == 0) {
            C55326xho.toast$default("originalLink can not be null", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        C49017ugc c49017ugc3 = c49149ujB.OLrzqt;
        if (c49017ugc3 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc3 = null;
        }
        android.text.Editable text2 = c49017ugc3.valueOf.getText();
        java.lang.String string2 = text2 != null ? text2.toString() : null;
        C49017ugc c49017ugc4 = c49149ujB.OLrzqt;
        if (c49017ugc4 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc4 = null;
        }
        android.text.Editable text3 = c49017ugc4.DbNXlk.getText();
        java.lang.String string3 = text3 != null ? text3.toString() : null;
        C49017ugc c49017ugc5 = c49149ujB.OLrzqt;
        if (c49017ugc5 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc5 = null;
        }
        boolean zIsChecked = c49017ugc5.AhwBna.isChecked();
        C49017ugc c49017ugc6 = c49149ujB.OLrzqt;
        if (c49017ugc6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49017ugc2 = c49017ugc6;
        }
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).AEQbTJ(string, new C48891ueI(string3 == null ? "" : string3, string2, zIsChecked, c49017ugc2.djBIcL.isChecked() ? RedirectBehavior.DIRECT_GOTO_BIZ_PAGE : RedirectBehavior.DEFAULT_ALLOW_DEEPLINK, null, 16, null));
        final Function1 function1 = new Function1() { // from class: o.ujN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.copydefault(this.copydefault, (C48887ueE) obj);
            }
        };
        InterfaceC58227yxM<? super C48887ueE> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ujR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49149ujB.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ujP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ujO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49149ujB.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C49149ujB c49149ujB, C48887ueE c48887ueE) {
        final java.lang.String strOLrzqt = c48887ueE.OLrzqt();
        java.lang.String strEZpvd = c48887ueE.EZpvd();
        C49017ugc c49017ugc = c49149ujB.OLrzqt;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        c49017ugc.iwGUEr.setText("shortLink:" + strOLrzqt + " \n\n fullLink:" + strEZpvd);
        C49352umt c49352umt = (C49352umt) android.view.LayoutInflater.from(c49149ujB.requireContext()).inflate(C48931uew.Application.getFieldNames, (android.view.ViewGroup) null, false).findViewById(C48931uew.StateListAnimator.QOLQEE);
        c49352umt.setTitle(strOLrzqt);
        c49352umt.setSubTitle(strEZpvd);
        c49352umt.setQRCode(strOLrzqt);
        android.graphics.Bitmap bitmapCopydefault = C33487mxQ.copydefault(c49149ujB.requireContext(), c49352umt, C55298xhM.dpInt$default(360, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(100, (android.content.Context) null, 1, (java.lang.Object) null), true, null);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        FragmentActivity fragmentActivityRequireActivity = c49149ujB.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        Intrinsics.copydefault(bitmapCopydefault);
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.ActionBar.create$default(actionBar, fragmentActivityRequireActivity, bitmapCopydefault, (ImageSource) null, new Function1() { // from class: o.ujJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.OLrzqt(strOLrzqt, (ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), new Function1() { // from class: o.ujK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.KWHzl((ShareConfig) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueKAEQbTJ = c49149ujB.AEQbTJ();
        FragmentActivity fragmentActivityRequireActivity2 = c49149ujB.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity2, "");
        interfaceC48893ueKAEQbTJ.copydefault((AbstractActivityC33041mov) fragmentActivityRequireActivity2, shareConfigCopydefault);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("test");
        imageShareParams.setBody(str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_CROP, false, null, null, 14, null));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C49149ujB c49149ujB, java.lang.Throwable th) {
        C49017ugc c49017ugc = c49149ujB.OLrzqt;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        c49017ugc.iwGUEr.setText(th.getMessage());
        C55326xho.OLrzqt(th.getMessage());
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C49017ugc c49017ugc = this.OLrzqt;
        C49017ugc c49017ugc2 = null;
        if (c49017ugc == null) {
            Intrinsics.gEmmrt("");
            c49017ugc = null;
        }
        if (c49017ugc.fJNWhG.getAdapter() != null) {
            return;
        }
        android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, getResources().getStringArray(C48894ueL.Application.AEQbTJ));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        C49017ugc c49017ugc3 = this.OLrzqt;
        if (c49017ugc3 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc3 = null;
        }
        c49017ugc3.fJNWhG.setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
        C49017ugc c49017ugc4 = this.OLrzqt;
        if (c49017ugc4 == null) {
            Intrinsics.gEmmrt("");
            c49017ugc4 = null;
        }
        c49017ugc4.fJNWhG.setSelection(0, true);
        C49017ugc c49017ugc5 = this.OLrzqt;
        if (c49017ugc5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49017ugc2 = c49017ugc5;
        }
        c49017ugc2.fJNWhG.setOnItemSelectedListener(new Application());
    }

    /* JADX INFO: renamed from: o.ujB$Application */
    public static final class Application implements AdapterView.OnItemSelectedListener {
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
        }

        public Application() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
            FootViewTheme footViewThemeValueOf = FootViewTheme.CREATOR.valueOf(i);
            C55326xho.toast$default("selected theme:" + footViewThemeValueOf, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            if (footViewThemeValueOf != null) {
                C49017ugc c49017ugc = C49149ujB.this.OLrzqt;
                C49017ugc c49017ugc2 = null;
                if (c49017ugc == null) {
                    Intrinsics.gEmmrt("");
                    c49017ugc = null;
                }
                c49017ugc.fIwbmz.setTheme(footViewThemeValueOf);
                C49017ugc c49017ugc3 = C49149ujB.this.OLrzqt;
                if (c49017ugc3 == null) {
                    Intrinsics.gEmmrt("");
                    c49017ugc3 = null;
                }
                c49017ugc3.AuCTel.setTheme(footViewThemeValueOf);
                C49017ugc c49017ugc4 = C49149ujB.this.OLrzqt;
                if (c49017ugc4 == null) {
                    Intrinsics.gEmmrt("");
                    c49017ugc4 = null;
                }
                c49017ugc4.isConnected.setTheme(footViewThemeValueOf);
                C49017ugc c49017ugc5 = C49149ujB.this.OLrzqt;
                if (c49017ugc5 == null) {
                    Intrinsics.gEmmrt("");
                    c49017ugc5 = null;
                }
                c49017ugc5.fetchVPNInfo.setTheme(footViewThemeValueOf);
                C49017ugc c49017ugc6 = C49149ujB.this.OLrzqt;
                if (c49017ugc6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c49017ugc2 = c49017ugc6;
                }
                c49017ugc2.AkhnZx.setTheme(footViewThemeValueOf);
                return;
            }
            C55326xho.toast$default("unknown position:" + i, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl();
    }

    public final void copydefault(android.view.View view) {
        android.graphics.Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ(view, true);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        Intrinsics.copydefault(bitmapAEQbTJ);
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, ImageShareParams.ActionBar.create$default(actionBar, fragmentActivityRequireActivity, bitmapAEQbTJ, (ImageSource) null, new Function1() { // from class: o.ujG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.valueOf((ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), null, 2, null);
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity2, "");
        interfaceC48893ueK.copydefault((AbstractActivityC33041mov) fragmentActivityRequireActivity2, shareConfigCreate$default);
    }

    public static final Unit valueOf(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("apitest");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        if (str == null || str.length() == 0) {
            C55326xho.toast$default("empty shortCode,please input at first", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C43423rox.unwrapResponseData$default(InterfaceC49179ujf.Companion.AEQbTJ().copydefault(str), (Function1) null, 1, (java.lang.Object) null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.ujC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.AEQbTJ(this.KWHzl, (ShareFooterDecodeInfo) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ujD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49149ujB.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ujL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ujQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49149ujB.AhwBna(function12, obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C49149ujB c49149ujB, ShareFooterDecodeInfo shareFooterDecodeInfo) {
        Intrinsics.copydefault(shareFooterDecodeInfo);
        c49149ujB.OLrzqt(shareFooterDecodeInfo);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(ShareFooterDecodeInfo shareFooterDecodeInfo) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.setTitle("decode result");
        AppCompatTextView appCompatTextView = new AppCompatTextView(viewOnClickListenerC54939xaY.getContext());
        appCompatTextView.setTextIsSelectable(true);
        TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.dHguZz);
        appCompatTextView.setTextColor(ContextCompat.getColor(appCompatTextView.getContext(), C52761wXj.Activity.Dmq));
        appCompatTextView.setText("deeplink:" + shareFooterDecodeInfo.getDeeplink());
        TextViewCompat.setLineHeight(appCompatTextView, C55298xhM.sp2px$default(20.0f, null, 1, null));
        appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        viewOnClickListenerC54939xaY.EZpvd(appCompatTextView);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) "OK", new View.OnClickListener() { // from class: o.ujS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49149ujB.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        final C49352umt c49352umt = (C49352umt) android.view.LayoutInflater.from(requireContext()).inflate(C48931uew.Application.getFieldNames, (android.view.ViewGroup) null, false).findViewById(C48931uew.StateListAnimator.QOLQEE);
        if (!android.text.TextUtils.equals(str, str2)) {
            c49352umt.setQRCode(str);
        }
        c49352umt.setSrcFrom("apitest", new Function0() { // from class: o.ujI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49149ujB.copydefault(this.copydefault, c49352umt);
            }
        });
    }

    public static final Unit copydefault(C49149ujB c49149ujB, C49352umt c49352umt) {
        android.graphics.Bitmap bitmapCopydefault = C33487mxQ.copydefault(c49149ujB.requireContext(), c49352umt, C55298xhM.dpInt$default(360, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(100, (android.content.Context) null, 1, (java.lang.Object) null), true, null);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        FragmentActivity fragmentActivityRequireActivity = c49149ujB.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        Intrinsics.copydefault(bitmapCopydefault);
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.ActionBar.create$default(actionBar, fragmentActivityRequireActivity, bitmapCopydefault, (ImageSource) null, new Function1() { // from class: o.ujF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.EZpvd((ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), new Function1() { // from class: o.ujE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.valueOf((ShareConfig) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueKAEQbTJ = c49149ujB.AEQbTJ();
        FragmentActivity fragmentActivityRequireActivity2 = c49149ujB.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity2, "");
        interfaceC48893ueKAEQbTJ.copydefault((AbstractActivityC33041mov) fragmentActivityRequireActivity2, shareConfigCopydefault);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("apitest");
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_CROP, false, null, null, 14, null));
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        final C49352umt c49352umt = (C49352umt) android.view.LayoutInflater.from(requireContext()).inflate(C48931uew.Application.getFieldNames, (android.view.ViewGroup) null, false).findViewById(C48931uew.StateListAnimator.QOLQEE);
        if (!android.text.TextUtils.equals(str, str2)) {
            c49352umt.setQRCode(str);
        }
        c49352umt.KWHzl(getViewLifecycleOwner(), c49352umt.OLrzqt(), new C48891ueI("apitest", null, false, null, null, 24, null), new Function1() { // from class: o.ujH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.KWHzl(this.copydefault, c49352umt, (C48887ueE) obj);
            }
        });
    }

    public static final Unit KWHzl(C49149ujB c49149ujB, C49352umt c49352umt, C48887ueE c48887ueE) {
        android.graphics.Bitmap bitmapCopydefault = C33487mxQ.copydefault(c49149ujB.requireContext(), c49352umt, C55298xhM.dpInt$default(360, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(100, (android.content.Context) null, 1, (java.lang.Object) null), true, null);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        FragmentActivity fragmentActivityRequireActivity = c49149ujB.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        Intrinsics.copydefault(bitmapCopydefault);
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.ActionBar.create$default(actionBar, fragmentActivityRequireActivity, bitmapCopydefault, (ImageSource) null, new Function1() { // from class: o.ujT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.AEQbTJ((ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), new Function1() { // from class: o.ujV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49149ujB.EZpvd((ShareConfig) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueKAEQbTJ = c49149ujB.AEQbTJ();
        FragmentActivity fragmentActivityRequireActivity2 = c49149ujB.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity2, "");
        interfaceC48893ueKAEQbTJ.copydefault((AbstractActivityC33041mov) fragmentActivityRequireActivity2, shareConfigCopydefault);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("apitest");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_CROP, false, null, null, 14, null));
        return Unit.INSTANCE;
    }
}
