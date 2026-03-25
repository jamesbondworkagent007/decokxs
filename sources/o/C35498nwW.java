package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import com.okinc.im.imui.privacy.SecurityType;
import com.okinc.im.imui.privacy.SettingType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35498nwW extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final java.util.List<java.lang.Object> AEQbTJ;
    public final Function1<SettingType, Unit> EZpvd;
    public final Function2<SecurityType, java.lang.Boolean, Unit> KWHzl;
    public final java.util.List<java.lang.Object> OLrzqt;

    /* JADX INFO: renamed from: o.nwW$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SecurityType.values().length];
            try {
                iArr[SecurityType.IM_GROUP_SEARCH_ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SecurityType.IM_CONTACT_DISCOVERY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SecurityType.IM_RECEIVE_INAPP_NOTIFICATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.im.imui.privacy.SecurityType, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.imui.privacy.SettingType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C35498nwW(@NotNull java.util.List<? extends java.lang.Object> list, @NotNull Function2<? super SecurityType, ? super java.lang.Boolean, Unit> function2, @NotNull Function1<? super SettingType, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = list;
        this.KWHzl = function2;
        this.EZpvd = function1;
        this.OLrzqt = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            AbstractC33939nLl abstractC33939nLlKWHzl = AbstractC33939nLl.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC33939nLlKWHzl, "");
            return new C35557nxc(abstractC33939nLlKWHzl);
        }
        if (i == 2) {
            AbstractC33936nLi abstractC33936nLiEZpvd = AbstractC33936nLi.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC33936nLiEZpvd, "");
            return new C35556nxb(abstractC33936nLiEZpvd);
        }
        throw new java.lang.IllegalArgumentException("Unsupported view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        OLrzqt(null);
        if (viewHolder instanceof C35557nxc) {
            java.lang.Object obj = this.OLrzqt.get(i);
            Intrinsics.copydefault(obj, "");
            ((C35557nxc) viewHolder).EZpvd((C37201opP) obj, this.KWHzl);
            return;
        }
        if (viewHolder instanceof C35556nxb) {
            java.lang.Object obj2 = this.OLrzqt.get(i);
            Intrinsics.copydefault(obj2, "");
            ((C35556nxb) viewHolder).copydefault((C37199opN) obj2, this.EZpvd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        java.lang.Object obj = this.OLrzqt.get(i);
        if (obj instanceof C37201opP) {
            return 1;
        }
        if (obj instanceof C37199opN) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("Unsupported item type");
    }

    /* JADX INFO: renamed from: o.nwW$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nwW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void OLrzqt(ChatSettingsResult chatSettingsResult) {
        boolean zCopydefault;
        if (chatSettingsResult == null) {
            return;
        }
        java.util.List<java.lang.Object> list = this.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (java.lang.Object objCopy$default : list) {
            if (objCopy$default instanceof C37201opP) {
                C37201opP c37201opP = (C37201opP) objCopy$default;
                int i = Activity.AEQbTJ[c37201opP.KWHzl().ordinal()];
                if (i == 1) {
                    zCopydefault = chatSettingsResult.copydefault();
                } else if (i == 2) {
                    zCopydefault = chatSettingsResult.EZpvd();
                } else if (i == 3) {
                    zCopydefault = chatSettingsResult.KWHzl();
                } else {
                    zCopydefault = c37201opP.EZpvd();
                }
                objCopy$default = C37201opP.copy$default(c37201opP, null, null, null, zCopydefault, 7, null);
            }
            arrayList.add(objCopy$default);
        }
        this.OLrzqt.clear();
        this.OLrzqt.addAll(arrayList);
        notifyDataSetChanged();
    }
}
