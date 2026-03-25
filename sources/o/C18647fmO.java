package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C18647fmO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18647fmO extends androidx.recyclerview.widget.ListAdapter<AddressBookEntity, ActionBar> {
    public final Function1<AddressBookEntity, Unit> EZpvd;
    public static final Application Companion = new Application(null);
    public static final TaskDescription AEQbTJ = new TaskDescription();

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18647fmO(@NotNull Function1<? super AddressBookEntity, Unit> function1) {
        super(AEQbTJ);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX INFO: renamed from: o.fmO$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C17119ewl AEQbTJ;
        public final Function1<AddressBookEntity, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C17119ewl c17119ewl, @NotNull Function1<? super AddressBookEntity, Unit> function1) {
            super(c17119ewl.getRoot());
            Intrinsics.checkNotNullParameter(c17119ewl, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = c17119ewl;
            this.KWHzl = function1;
        }

        public final void KWHzl(@NotNull AddressBookEntity addressBookEntity) {
            Intrinsics.checkNotNullParameter(addressBookEntity, "");
            C17119ewl c17119ewl = this.AEQbTJ;
            AppCompatImageView appCompatImageView = c17119ewl.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C14725dqq.copydefault(appCompatImageView, addressBookEntity.getAddress(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.fmR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18647fmO.ActionBar.copydefault((C5335Nt) obj);
                }
            }, 32.0f);
            c17119ewl.AEQbTJ.setText(addressBookEntity.getName());
            c17119ewl.KWHzl.setText(addressBookEntity.getAddress());
            ConstraintLayout root = c17119ewl.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, this, addressBookEntity));
        }

        public static final Unit copydefault(C5335Nt c5335Nt) {
            Intrinsics.checkNotNullParameter(c5335Nt, "");
            c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(4.0f, null, 1, null)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.fmO$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ AddressBookEntity KWHzl;
            public final /* synthetic */ ActionBar OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, ActionBar actionBar, AddressBookEntity addressBookEntity) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.OLrzqt = actionBar;
                this.KWHzl = addressBookEntity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.OLrzqt.KWHzl.invoke(this.KWHzl);
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17119ewl c17119ewlKWHzl = C17119ewl.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17119ewlKWHzl, "");
        return new ActionBar(c17119ewlKWHzl, this.EZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        AddressBookEntity item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        actionBar.KWHzl(item);
    }

    /* JADX INFO: renamed from: o.fmO$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fmO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.fmO$TaskDescription */
    public static final class TaskDescription extends DiffUtil.ItemCallback<AddressBookEntity> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(AddressBookEntity addressBookEntity, AddressBookEntity addressBookEntity2) {
            Intrinsics.checkNotNullParameter(addressBookEntity, "");
            Intrinsics.checkNotNullParameter(addressBookEntity2, "");
            return Intrinsics.EZpvd((java.lang.Object) addressBookEntity.getAddress(), (java.lang.Object) addressBookEntity2.getAddress());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(AddressBookEntity addressBookEntity, AddressBookEntity addressBookEntity2) {
            Intrinsics.checkNotNullParameter(addressBookEntity, "");
            Intrinsics.checkNotNullParameter(addressBookEntity2, "");
            return Intrinsics.EZpvd(addressBookEntity, addressBookEntity2);
        }
    }
}
