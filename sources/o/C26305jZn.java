package o;

import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26305jZn extends kLO<HolderDetailModel> {

    /* JADX INFO: renamed from: o.jZn$ActionBar */
    public static final class ActionBar {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.jZn$TaskDescription */
    public static final class TaskDescription {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.kLO
    /* JADX INFO: renamed from: OLrzqt, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean EZpvd(@NotNull HolderDetailModel holderDetailModel, @NotNull HolderDetailModel holderDetailModel2) {
        Intrinsics.checkNotNullParameter(holderDetailModel, "");
        Intrinsics.checkNotNullParameter(holderDetailModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) holderDetailModel.valueOf(), (java.lang.Object) holderDetailModel2.valueOf()) && holderDetailModel.fARcdN() == holderDetailModel2.fARcdN();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.kLO
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull HolderDetailModel holderDetailModel, @NotNull HolderDetailModel holderDetailModel2) {
        Intrinsics.checkNotNullParameter(holderDetailModel, "");
        Intrinsics.checkNotNullParameter(holderDetailModel2, "");
        return Intrinsics.EZpvd(holderDetailModel, holderDetailModel2);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.kLO
    /* JADX INFO: renamed from: copydefault, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.lang.Object OLrzqt(@NotNull HolderDetailModel holderDetailModel, @NotNull HolderDetailModel holderDetailModel2) {
        Intrinsics.checkNotNullParameter(holderDetailModel, "");
        Intrinsics.checkNotNullParameter(holderDetailModel2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) holderDetailModel.copydefault(), (java.lang.Object) holderDetailModel2.copydefault()) || !Intrinsics.EZpvd((java.lang.Object) holderDetailModel.AYXKKw(), (java.lang.Object) holderDetailModel2.AYXKKw()) || !Intrinsics.EZpvd((java.lang.Object) holderDetailModel.gEmmrt(), (java.lang.Object) holderDetailModel2.gEmmrt())) {
            return ActionBar.copydefault;
        }
        if (Intrinsics.EZpvd((java.lang.Object) holderDetailModel.AuCTel(), (java.lang.Object) holderDetailModel2.AuCTel()) && Intrinsics.EZpvd((java.lang.Object) holderDetailModel.fJNWhG(), (java.lang.Object) holderDetailModel2.fJNWhG())) {
            return null;
        }
        return TaskDescription.EZpvd;
    }
}
