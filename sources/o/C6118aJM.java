package o;

import android.view.View;
import android.widget.LinearLayout;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.CredentialType;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.aJM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6118aJM {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.aJM$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CredentialType.values().length];
            try {
                iArr[CredentialType.HYBRID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CredentialType.INTERNAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CredentialType.USB.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX INFO: renamed from: o.aJM$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aJM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void OLrzqt(@NotNull android.widget.TextView textView, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        textView.setText(authenticatorDisplayModel.AhwBna());
    }

    public final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        int i;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        if (authenticatorDisplayModel.values()) {
            i = C52761wXj.TaskDescription.HJWChPOKBmQNaCIdOM;
        } else {
            int i2 = ActionBar.AEQbTJ[authenticatorDisplayModel.KWHzl().ordinal()];
            i = i2 != 1 ? i2 != 2 ? i2 != 3 ? C52761wXj.TaskDescription.hfeTOA : C52761wXj.TaskDescription.QjzqRB : C52761wXj.TaskDescription.DIIpTV : C52761wXj.TaskDescription.HJWChPOKBmQNaCIdOM;
        }
        imageView.setImageResource(i);
    }

    public final void OLrzqt(@NotNull android.widget.LinearLayout linearLayout, @NotNull android.widget.LinearLayout linearLayout2, @NotNull android.widget.TextView textView, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(linearLayout, "");
        Intrinsics.checkNotNullParameter(linearLayout2, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        Intrinsics.checkNotNullParameter(context, "");
        int iAEQbTJ = authenticatorDisplayModel.AEQbTJ();
        linearLayout.setVisibility(authenticatorDisplayModel.DbNXlk() ? 0 : 8);
        linearLayout2.removeAllViews();
        linearLayout2.setVisibility(iAEQbTJ > 0 ? 0 : 8);
        java.util.List<java.lang.String> listOLrzqt = authenticatorDisplayModel.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        int i = 0;
        for (java.lang.Object obj : listOLrzqt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (i < 3) {
                ShapeableImageView shapeableImageView = new ShapeableImageView(context);
                shapeableImageView.setShapeAppearanceModel(shapeableImageView.getShapeAppearanceModel().toBuilder().setAllCornerSizes(C55298xhM.AEQbTJ(4, context)).build());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C55298xhM.copydefault(20.0f, context), C55298xhM.copydefault(20.0f, context));
                if (i > 0) {
                    layoutParams.setMargins(C55298xhM.copydefault(-4.0f, context), 0, 0, 0);
                }
                shapeableImageView.setLayoutParams(layoutParams);
                Glide.AEQbTJ(context).EZpvd(str).KWHzl(C52761wXj.Activity.invokespecialODCBUN).copydefault(C52761wXj.Activity.invokespecialODCBUN).EZpvd((android.widget.ImageView) shapeableImageView);
                linearLayout2.addView(shapeableImageView);
            } else if (i == 3) {
                java.lang.String str2 = Marker.ANY_NON_NULL_MARKER + (authenticatorDisplayModel.OLrzqt().size() - 3);
                android.widget.TextView textView2 = new android.widget.TextView(context);
                textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
                textView2.setTextAppearance(C52761wXj.LoaderManager.OBJEWx);
                textView2.setTextSize(2, 10.0f);
                textView2.setText(str2);
                textView2.setBackground(C33070mpX.KWHzl(C8206ayP.Activity.copydefault));
                textView2.setGravity(17);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C55298xhM.copydefault(20.0f, context), C55298xhM.copydefault(20.0f, context));
                layoutParams2.setMargins(C55298xhM.copydefault(-4.0f, context), 0, 0, 0);
                textView2.setLayoutParams(layoutParams2);
                linearLayout2.addView(textView2);
            }
            arrayList.add(Unit.INSTANCE);
            i++;
        }
        textView.setText(C33069mpW.OLrzqt(C33070mpX.EZpvd(C8206ayP.PendingIntent.OLrzqt, iAEQbTJ), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(iAEQbTJ)))));
    }

    public final void AEQbTJ(@NotNull android.widget.TextView textView, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        java.lang.String strAYXKKw = "";
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        textView.setVisibility((!authenticatorDisplayModel.ejfBZ() && (authenticatorDisplayModel.gEmmrt() || authenticatorDisplayModel.valueOf())) ? 0 : 8);
        if (authenticatorDisplayModel.gEmmrt()) {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DCUTEIdCUTEI);
        } else if (authenticatorDisplayModel.valueOf()) {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.spnCvw);
        }
        textView.setText(strAYXKKw);
    }

    public final void EZpvd(@NotNull android.widget.TextView textView, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        boolean zEZpvd = ((InterfaceC49494upc) C43251rlk.copydefault(InterfaceC49494upc.class)).EZpvd();
        pUU.KWHzl("PasskeyItemBindingUtils", "bindNotAvailableOrDexNotSupported: " + zEZpvd);
        if (!authenticatorDisplayModel.isConnected()) {
            if (!authenticatorDisplayModel.AkhnZx()) {
                if (authenticatorDisplayModel.values() && zEZpvd) {
                    textView.setVisibility(0);
                    textView.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.DPHsZd));
                    textView.setOnClickListener(new TaskDescription(textView, 1000L, textView));
                    return;
                }
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(textView.getContext().getString(C8206ayP.Dialog.DKtBnz));
            textView.setOnClickListener(new StateListAnimator(textView, 1000L, textView));
            return;
        }
        textView.setVisibility(0);
        textView.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.QIZEnU));
        textView.setOnClickListener(new Application(textView, 1000L, textView));
    }

    /* JADX INFO: renamed from: o.aJM$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.aJM$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.widget.TextView OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.widget.TextView textView) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.copydefault(context);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.ULRxlR));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.UhxbNG));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.RvdRAu), (View.OnClickListener) new LoaderManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.aJM$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ android.widget.TextView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.widget.TextView textView) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.copydefault(context);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(context.getString(C8206ayP.Dialog.YqksP));
                viewOnClickListenerC54939xaY.EZpvd(context.getString(C8206ayP.Dialog.awiJhF));
                java.lang.String string = context.getString(C8206ayP.Dialog.frkDMe);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new FragmentManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.aJM$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, android.widget.TextView textView) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.copydefault(context);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.DLGVGj));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C8206ayP.Dialog.iCPUKe));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.RvdRAu), (View.OnClickListener) new PendingIntent(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.aJM$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.aJM$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }
}
