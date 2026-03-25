package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.okmarket.ui.market.data.UserGroupVo;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46662tbR extends C40512qYp {
    public C46662tbR(@NotNull java.lang.String str, @NotNull Function2<? super java.lang.Integer, ? super UserGroupVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        register(UserGroupVo.class, new ActionBar(str, function2));
    }

    public final void KWHzl(int i, int i2) {
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) EZpvd());
        Collections.swap(listFJNWhG, i, i2);
        AbstractC40521qYy.submitList$default(this, listFJNWhG, null, 2, null);
    }

    /* JADX DEBUG: Possible override for method o.qYy.copydefault()Landroidx/recyclerview/widget/AsyncListDiffer; */
    public final java.util.List<UserGroupVo> copydefault() {
        java.util.List<InterfaceC40516qYt> listEZpvd = EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (obj instanceof UserGroupVo) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tbR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C46662tbR c46662tbR, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c46662tbR.KWHzl((java.util.List<UserGroupVo>) list, (Function0<Unit>) function0);
    }

    public final void KWHzl(@NotNull java.util.List<UserGroupVo> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, function0);
    }

    /* JADX INFO: renamed from: o.tbR$ActionBar */
    public static final class ActionBar extends AbstractC40510qYn<UserGroupVo, C42811rdU> {
        public final Function2<java.lang.Integer, UserGroupVo, Unit> OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.okinc.okmarket.ui.market.data.UserGroupVo, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull java.lang.String str, @NotNull Function2<? super java.lang.Integer, ? super UserGroupVo, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.copydefault = str;
            this.OLrzqt = function2;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
        @Override // o.AbstractC40510qYn
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public C42811rdU AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C42811rdU c42811rdUAEQbTJ = C42811rdU.AEQbTJ(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c42811rdUAEQbTJ, "");
            return c42811rdUAEQbTJ;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
        @Override // o.AbstractC40510qYn
        public void AEQbTJ(@NotNull C42811rdU c42811rdU, int i, @NotNull UserGroupVo userGroupVo) {
            Intrinsics.checkNotNullParameter(c42811rdU, "");
            Intrinsics.checkNotNullParameter(userGroupVo, "");
            c42811rdU.AEQbTJ.setText(userGroupVo.getUserGroup().getTranslatedGroupName());
            AppCompatImageView appCompatImageView = c42811rdU.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) userGroupVo.getUserGroup().getGroupName()) ? 0 : 8);
            android.widget.LinearLayout root = c42811rdU.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, this, i, userGroupVo));
        }

        /* JADX INFO: renamed from: o.tbR$ActionBar$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ ActionBar AEQbTJ;
            public final /* synthetic */ int EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ UserGroupVo OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, ActionBar actionBar, int i, UserGroupVo userGroupVo) {
                this.copydefault = view;
                this.KWHzl = j;
                this.AEQbTJ = actionBar;
                this.EZpvd = i;
                this.OLrzqt = userGroupVo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.AEQbTJ.OLrzqt.invoke(java.lang.Integer.valueOf(this.EZpvd), this.OLrzqt);
                }
            }
        }
    }
}
