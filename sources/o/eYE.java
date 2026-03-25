package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import com.okinc.uilab.item.OKRegularCell;
import com.okinc.web.WebActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eYE extends wXX {
    public C16544elt OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eYF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eYE.AEQbTJ(this.EZpvd);
        }
    });
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eYE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eYE$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ eYE newInstance$default(TaskDescription taskDescription, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = new java.util.ArrayList();
            }
            return taskDescription.AEQbTJ(list);
        }

        public final eYE AEQbTJ(@NotNull java.util.List<TagWrapper> list) {
            Intrinsics.checkNotNullParameter(list, "");
            eYE eye = new eYE();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("key_option_list", new java.util.ArrayList<>(list));
            eye.setArguments(bundle);
            return eye;
        }
    }

    private final java.util.ArrayList<TagWrapper> KWHzl() {
        return (java.util.ArrayList) this.copydefault.getValue();
    }

    public static final java.util.ArrayList AEQbTJ(eYE eye) {
        java.util.ArrayList parcelableArrayList = eye.requireArguments().getParcelableArrayList("key_option_list");
        return parcelableArrayList == null ? new java.util.ArrayList() : parcelableArrayList;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.eYM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eYE.EZpvd(this.copydefault);
            }
        });
    }

    public static final void EZpvd(eYE eye) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) eye, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setDividerVisibility(false);
        java.lang.String string = getString(C13754dXa.FragmentManager.aWJMta);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setVisibility(0);
        wxq.EZpvd().setVisibility(8);
        wxq.EZpvd().setImageResource(0);
        wxq.KWHzl().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16544elt c16544eltEZpvd = C16544elt.EZpvd(android.view.LayoutInflater.from(getContext()), constraintLayout, false);
        this.OLrzqt = c16544eltEZpvd;
        if (c16544eltEZpvd != null && (linearLayout = c16544eltEZpvd.EZpvd) != null) {
            java.util.Iterator<TagWrapper> it = KWHzl().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                TagWrapper next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                final TagWrapper tagWrapper = next;
                java.lang.String strKWHzl = tagWrapper.KWHzl();
                if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "kol")) {
                    android.content.Context context = linearLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    final OKRegularCell oKRegularCell = new OKRegularCell(context, null, 0, 6, null);
                    java.lang.String string = getString(C13754dXa.FragmentManager.ActivityResultContractsCaptureVideo);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    oKRegularCell.setDescription(string);
                    java.lang.String string2 = getString(C13754dXa.FragmentManager.setMediaType);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    oKRegularCell.setTitle(string2);
                    oKRegularCell.setIconSize(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null));
                    oKRegularCell.setIconTint(C33070mpX.AEQbTJ(C52761wXj.Activity.DCUTEIddSDPG));
                    android.widget.ImageView imageViewOLrzqt = oKRegularCell.OLrzqt();
                    imageViewOLrzqt.setImageResource(C13754dXa.Activity.DAIeex);
                    imageViewOLrzqt.setVisibility(0);
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) tagWrapper.EZpvd().KWHzl())) {
                        oKRegularCell.setOnClickListener(new View.OnClickListener() { // from class: o.eYJ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                eYE.EZpvd(oKRegularCell, tagWrapper, view);
                            }
                        });
                    }
                    linearLayout.addView(oKRegularCell, linearLayout.getChildCount());
                } else if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "smartMoney")) {
                    android.content.Context context2 = linearLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    OKRegularCell oKRegularCell2 = new OKRegularCell(context2, null, 0, 6, null);
                    java.lang.String string3 = getString(C13754dXa.FragmentManager.ActivityResultContractsCreateDocument);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    oKRegularCell2.setDescription(string3);
                    java.lang.String string4 = getString(C13754dXa.FragmentManager.PickVisualMediaRequestBuilder);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    oKRegularCell2.setTitle(string4);
                    oKRegularCell2.setIconSize(C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null));
                    oKRegularCell2.setIconTint(C33070mpX.AEQbTJ(C52761wXj.Activity.DCUTEIddSDPG));
                    android.widget.ImageView imageViewOLrzqt2 = oKRegularCell2.OLrzqt();
                    imageViewOLrzqt2.setImageResource(C57406yhn.Activity.wlaJM);
                    imageViewOLrzqt2.setVisibility(0);
                    linearLayout.addView(oKRegularCell2, linearLayout.getChildCount());
                }
            }
        }
        C16544elt c16544elt = this.OLrzqt;
        constraintLayout.addView(c16544elt != null ? c16544elt.getRoot() : null);
    }

    public static final void EZpvd(OKRegularCell oKRegularCell, TagWrapper tagWrapper, android.view.View view) {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = oKRegularCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", tagWrapper.EZpvd().KWHzl())), null, 4, null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ eYE AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, eYE eye) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = eye;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
