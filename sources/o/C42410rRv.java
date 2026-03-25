package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressField;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rRv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42410rRv extends AbstractC59533zio<AddressSearchBean, Application> {
    public final Function2<AddressSearchBean, java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<AddressSearchBean, java.lang.String, Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.rRv$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C42410rRv AEQbTJ;
        public final /* synthetic */ AddressSearchBean EZpvd;
        public final /* synthetic */ AddressField KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42410rRv c42410rRv, AddressSearchBean addressSearchBean, AddressField addressField) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c42410rRv;
            this.EZpvd = addressSearchBean;
            this.KWHzl = addressField;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function2<AddressSearchBean, java.lang.String, Unit> function2EZpvd = this.AEQbTJ.EZpvd();
                if (function2EZpvd != null) {
                    AddressSearchBean addressSearchBean = this.EZpvd;
                    java.lang.String streetAddress = this.KWHzl.getStreetAddress();
                    if (streetAddress == null) {
                        streetAddress = "";
                    }
                    function2EZpvd.invoke(addressSearchBean, streetAddress);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchBean, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C42410rRv(Function2<? super AddressSearchBean, ? super java.lang.String, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.dNCPSb, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull AddressSearchBean addressSearchBean) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(addressSearchBean, "");
        java.lang.String localSearchString = addressSearchBean.getLocalSearchString();
        java.util.Iterator<T> it = addressSearchBean.getAutoCompleteAddress().getFields().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((AddressField) next).getStreetAddress())) {
                    break;
                }
            }
        }
        AddressField addressField = (AddressField) next;
        if (addressField != null) {
            final int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            android.text.SpannableString spannableString = new android.text.SpannableString(java.lang.String.valueOf(addressField.getStreetAddress()));
            C33061mpO.setupSpanStyles$default(spannableString, new java.lang.String[]{localSearchString}, 0, MatchPattern.CONTAINS, true, new Function1() { // from class: o.rRx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42410rRv.copydefault(iCopydefault, (java.util.List) obj);
                }
            }, 2, null);
            application.OLrzqt().setText(spannableString);
            application.KWHzl().setText(addressField.getRemainAddress());
            android.view.View view = application.itemView;
            view.setOnClickListener(new TaskDescription(view, 1000L, this, addressSearchBean, addressField));
            return;
        }
        application.OLrzqt().setText("");
        application.KWHzl().setText("");
        application.itemView.setOnClickListener(null);
    }

    public static final Unit copydefault(int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rRv$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C43662rtX.ActionBar.QWpYiD);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C43662rtX.ActionBar.fiXcQa);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.copydefault = (android.widget.TextView) viewFindViewById2;
        }
    }
}
