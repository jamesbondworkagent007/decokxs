package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_search.model.Kol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C46080tHb extends androidx.recyclerview.widget.ListAdapter<Kol, StateListAnimator> {
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    public C46080tHb() {
        super(new Activity());
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46259tNs c46259tNsKWHzl = C46259tNs.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c46259tNsKWHzl, "");
        return new StateListAnimator(this, c46259tNsKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Kol item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        stateListAnimator.EZpvd(item);
    }

    /* JADX INFO: renamed from: o.tHb$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C46259tNs AEQbTJ;
        public final /* synthetic */ C46080tHb copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C46080tHb c46080tHb, C46259tNs c46259tNs) {
            super(c46259tNs.getRoot());
            Intrinsics.checkNotNullParameter(c46259tNs, "");
            this.copydefault = c46080tHb;
            this.AEQbTJ = c46259tNs;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void EZpvd(@NotNull Kol kol) {
            java.lang.String strEZpvd;
            java.lang.String bio;
            Intrinsics.checkNotNullParameter(kol, "");
            C46259tNs c46259tNs = this.AEQbTJ;
            C46080tHb c46080tHb = this.copydefault;
            AppCompatImageView appCompatImageView = c46259tNs.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            java.lang.String portrait = kol.getPortrait();
            C33054mpH.loadAvatar$default(appCompatImageView, portrait == null ? "" : portrait, null, null, 6, null);
            AppCompatTextView appCompatTextView = c46259tNs.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            java.lang.String nickName = kol.getNickName();
            if (nickName == null) {
                nickName = "";
            }
            c46080tHb.EZpvd(appCompatTextView, nickName);
            android.widget.TextView textView = c46259tNs.EZpvd;
            android.content.Context context = c46259tNs.getRoot().getContext();
            if (context != null) {
                int i = C47501trL.LoaderManager.copydefault;
                java.lang.Integer followerCount = kol.getFollowerCount();
                strEZpvd = pTD.EZpvd(context, i, followerCount != null ? followerCount.intValue() : 0, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(kol.getFollowerCount()))));
            } else {
                strEZpvd = null;
            }
            textView.setText(strEZpvd);
            java.lang.String translatedBio = kol.getTranslatedBio();
            if (translatedBio == null) {
                bio = kol.getBio();
            } else {
                bio = C33129mqd.OLrzqt((java.lang.CharSequence) translatedBio) ? translatedBio : null;
                if (bio == null) {
                }
            }
            c46259tNs.KWHzl.setText(bio != null ? bio : "");
            ConstraintLayout root = c46259tNs.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0959StateListAnimator(root, 1000L, c46259tNs, kol));
        }

        /* JADX INFO: renamed from: o.tHb$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0959StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C46259tNs OLrzqt;
            public final /* synthetic */ Kol copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0959StateListAnimator(android.view.View view, long j, C46259tNs c46259tNs, Kol kol) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.OLrzqt = c46259tNs;
                this.copydefault = kol;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.String string;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    if (((tWL) C43251rlk.copydefault(tWL.class)).AhwBna()) {
                        C46447tUr c46447tUr = C46447tUr.KWHzl;
                        android.content.Context context = this.OLrzqt.getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        java.lang.Long kolId = this.copydefault.getKolId();
                        C46447tUr.openPlanetUserProfilePage$default(c46447tUr, context, "", (kolId == null || (string = kolId.toString()) == null) ? "" : string, "", "", "", C56423yEv.EZpvd(C56390yDp.OLrzqt("isOrbiter", "1")), null, 128, null);
                        return;
                    }
                    C43056riA c43056riA = C43056riA.AEQbTJ;
                    android.content.Context context2 = this.OLrzqt.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    c43056riA.copydefault(context2, "market", "/feed/profile", C56424yEw.gEmmrt(C56390yDp.OLrzqt("authorId", C33129mqd.gEmmrt(this.copydefault.getKolId())), C56390yDp.OLrzqt("nickName", C33129mqd.gEmmrt(this.copydefault.getNickName())), C56390yDp.OLrzqt("portrait", C33129mqd.gEmmrt(this.copydefault.getPortrait())), C56390yDp.OLrzqt("extraParams", new LinkedHashMap())));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.tHb$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity extends DiffUtil.ItemCallback<Kol> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull Kol kol, @NotNull Kol kol2) {
            Intrinsics.checkNotNullParameter(kol, "");
            Intrinsics.checkNotNullParameter(kol2, "");
            return Intrinsics.EZpvd(kol.getKolId(), kol2.getKolId());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull Kol kol, @NotNull Kol kol2) {
            Intrinsics.checkNotNullParameter(kol, "");
            Intrinsics.checkNotNullParameter(kol2, "");
            return Intrinsics.EZpvd(kol, kol2);
        }
    }

    public final void EZpvd(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        java.lang.String str = this.KWHzl;
        if (str != null && str.length() != 0) {
            tUO.addHighLightTv$default(textView, charSequence.toString(), java.lang.String.valueOf(this.KWHzl), false, 8, null);
        } else {
            textView.setText(charSequence);
        }
    }
}
