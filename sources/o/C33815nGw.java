package o;

import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentKt;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nGw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33815nGw extends wXS {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nGx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33815nGw.KWHzl(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXS
    public java.lang.CharSequence copydefault() {
        return "";
    }

    @Override // o.wXS, o.wXX
    public boolean getHasFooter() {
        return false;
    }

    private final java.util.List<IMenuItemPerformer> OLrzqt() {
        return (java.util.List) this.EZpvd.getValue();
    }

    public static final java.util.ArrayList KWHzl(C33815nGw c33815nGw) {
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = c33815nGw.getArguments();
            if (arguments != null) {
                return arguments.getParcelableArrayList("list", IMenuItemPerformer.class);
            }
        } else {
            android.os.Bundle arguments2 = c33815nGw.getArguments();
            if (arguments2 != null) {
                return arguments2.getParcelableArrayList("list");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o.nGw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C33815nGw OLrzqt(@NotNull java.util.List<? extends IMenuItemPerformer> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C33815nGw c33815nGw = new C33815nGw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("list", new java.util.ArrayList<>(list));
            c33815nGw.setArguments(bundle);
            return c33815nGw;
        }
    }

    @Override // o.wXS, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(67);
        LinearLayoutCompat linearLayoutCompatEZpvd = c52781wYc.EZpvd();
        if (linearLayoutCompatEZpvd != null) {
            linearLayoutCompatEZpvd.setVisibility(8);
        }
    }

    @Override // o.wXS, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C35399nuc.TaskDescription.OLrzqt));
    }

    @Override // o.wXS
    public void copydefault(@NotNull LinearLayoutCompat linearLayoutCompat) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "");
        pUU.EZpvd("HideTrendingGroupsBottomSheetMenuFragment", "menuList: " + OLrzqt());
        java.util.List<IMenuItemPerformer> listOLrzqt = OLrzqt();
        if (listOLrzqt != null) {
            int i = 0;
            for (java.lang.Object obj : listOLrzqt) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                final IMenuItemPerformer iMenuItemPerformer = (IMenuItemPerformer) obj;
                java.lang.CharSequence charSequenceEZpvd = iMenuItemPerformer.EZpvd();
                if (charSequenceEZpvd != null) {
                    final android.widget.TextView textViewAEQbTJ = AEQbTJ(linearLayoutCompat, charSequenceEZpvd);
                    textViewAEQbTJ.setTypeface(C55051xce.OLrzqt.valueOf());
                    textViewAEQbTJ.setGravity(TextAlign.LEFT);
                    textViewAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(12.0f, null, 1, null));
                    textViewAEQbTJ.setBackgroundResource(C35399nuc.ActionBar.EZpvd);
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(iMenuItemPerformer.AEQbTJ());
                    if (!java.lang.Boolean.valueOf(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt)).booleanValue()) {
                        strGEmmrt = null;
                    }
                    if (strGEmmrt == null) {
                        strGEmmrt = "menu_item_" + i;
                    }
                    textViewAEQbTJ.setContentDescription(strGEmmrt);
                    textViewAEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds(iMenuItemPerformer.copydefault(), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
                    textViewAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nGy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C33815nGw.copydefault(this.copydefault, iMenuItemPerformer, textViewAEQbTJ, view);
                        }
                    });
                }
                i++;
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(C33815nGw c33815nGw, IMenuItemPerformer iMenuItemPerformer, android.widget.TextView textView, android.view.View view) {
        c33815nGw.dismissAllowingStateLoss();
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        iMenuItemPerformer.AEQbTJ(context);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("RESULT_IM_KEY_MENU", iMenuItemPerformer);
        bundle.putSerializable("RESULT_IM_KEY_MENU_SELECTED", iMenuItemPerformer.AEQbTJ());
        FragmentKt.setFragmentResult(c33815nGw, "REQUEST_IM_KEY_MENU_SELECTED", bundle);
    }
}
