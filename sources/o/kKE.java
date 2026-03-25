package o;

import com.okinc.market.watch.data.UserGroup;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kKE extends AbstractC32997moD {
    public java.util.List<UserGroup> AEQbTJ;

    @Override // o.AbstractC32997moD
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.List<UserGroup> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<UserGroup> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kKE(@NotNull java.util.List<UserGroup> list, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.AEQbTJ = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        java.lang.String translatedGroupName;
        UserGroup userGroup = (UserGroup) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        return (userGroup == null || (translatedGroupName = userGroup.getTranslatedGroupName()) == null) ? "" : translatedGroupName;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        java.lang.String groupName;
        java.lang.String translatedGroupName;
        UserGroup userGroup = (UserGroup) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        java.lang.String str = "";
        if (userGroup == null || (groupName = userGroup.getGroupName()) == null) {
            groupName = "";
        }
        UserGroup userGroup2 = (UserGroup) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        if (userGroup2 != null && (translatedGroupName = userGroup2.getTranslatedGroupName()) != null) {
            str = translatedGroupName;
        }
        UserGroup userGroup3 = (UserGroup) CollectionsKt___CollectionsKt.AkhnZx(this.AEQbTJ, i);
        return C27931kIq.Companion.copydefault(groupName, str, userGroup3 != null ? userGroup3.isPreset() : false);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        try {
            java.lang.Object objInstantiateItem = super.instantiateItem(viewGroup, i);
            Intrinsics.checkNotNullExpressionValue(objInstantiateItem, "");
            return objInstantiateItem;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return new androidx.fragment.app.Fragment();
        }
    }

    @Override // o.AbstractC32997moD, androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return super.getItemPosition(obj);
    }
}
