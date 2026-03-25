package com.okinc.okex.center.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC45384sol;
import o.AbstractC47450tqK;
import o.C47315tni;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class LoadingAdapter extends AbstractC45384sol<Application> {
    public final LoadingStyle OLrzqt;

    public LoadingAdapter(@NotNull LoadingStyle loadingStyle) {
        Intrinsics.checkNotNullParameter(loadingStyle, "");
        this.OLrzqt = loadingStyle;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LoadingStyle {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LoadingStyle[] $VALUES;
        public static final LoadingStyle RECENT_ACTIVITY = new LoadingStyle("RECENT_ACTIVITY", 0);
        public static final LoadingStyle ARTICLES = new LoadingStyle("ARTICLES", 1);
        public static final LoadingStyle HUB = new LoadingStyle("HUB", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LoadingStyle[] $values() {
            return new LoadingStyle[]{RECENT_ACTIVITY, ARTICLES, HUB};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LoadingStyle> getEntries() {
            return $ENTRIES;
        }

        private LoadingStyle(String str, int i) {
        }

        static {
            LoadingStyle[] loadingStyleArr$values = $values();
            $VALUES = loadingStyleArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(loadingStyleArr$values);
        }

        public static LoadingStyle valueOf(String str) {
            return (LoadingStyle) Enum.valueOf(LoadingStyle.class, str);
        }

        public static LoadingStyle[] values() {
            return (LoadingStyle[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47450tqK abstractC47450tqKKWHzl = AbstractC47450tqK.KWHzl(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47450tqKKWHzl, "");
        return new Application(this, abstractC47450tqKKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        application.AEQbTJ();
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ LoadingAdapter EZpvd;
        public final AbstractC47450tqK OLrzqt;

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.adapter.LoadingAdapter$Application$Application, reason: collision with other inner class name */
        public final /* synthetic */ class C0535Application {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[LoadingStyle.values().length];
                try {
                    iArr[LoadingStyle.RECENT_ACTIVITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadingStyle.ARTICLES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LoadingStyle.HUB.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull LoadingAdapter loadingAdapter, AbstractC47450tqK abstractC47450tqK) {
            super(abstractC47450tqK.getRoot());
            Intrinsics.checkNotNullParameter(abstractC47450tqK, "");
            this.EZpvd = loadingAdapter;
            this.OLrzqt = abstractC47450tqK;
        }

        public final void AEQbTJ() {
            int i;
            int i2 = C0535Application.OLrzqt[this.EZpvd.OLrzqt.ordinal()];
            if (i2 == 1) {
                i = C47315tni.ActionBar.QSLkRj;
            } else if (i2 == 2) {
                i = C47315tni.ActionBar.dHguZz;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C47315tni.ActionBar.OJuSTm;
            }
            ViewStub viewStub = this.OLrzqt.EZpvd.getViewStub();
            if (viewStub != null) {
                viewStub.setLayoutResource(i);
                viewStub.inflate();
            }
        }
    }
}
