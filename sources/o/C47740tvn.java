package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okapm.okqpl.util.QPLConstants;
import com.okinc.planet_api.publisher.PlanetPublisherPluginPreviewType;
import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47501trL;
import o.C47740tvn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47740tvn extends androidx.fragment.app.Fragment {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public TaskDescription AYXKKw;
    public tNT KWHzl;
    public Function1<? super tWX, Unit> OLrzqt;
    public Function2<? super tWV, ? super PlanetPublisherPluginType, Unit> copydefault;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.tvt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47740tvn.OLrzqt();
        }
    });

    /* JADX INFO: renamed from: o.tvn$Activity */
    public static final class Activity extends GridLayoutManager.SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C47736tvj OLrzqt() {
        return tPF.copydefault.akftKQ();
    }

    private final C47736tvj copydefault() {
        return (C47736tvj) this.valueOf.getValue();
    }

    public final tNT AEQbTJ() {
        tNT tnt = this.KWHzl;
        Intrinsics.copydefault(tnt);
        return tnt;
    }

    /* JADX INFO: renamed from: o.tvn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tvn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.tvn$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C47740tvn newInstance$default(ActionBar actionBar, Function1 function1, Function2 function2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function2 = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return actionBar.AEQbTJ(function1, function2, z);
        }

        public final C47740tvn AEQbTJ(Function1<? super tWX, Unit> function1, Function2<? super tWV, ? super PlanetPublisherPluginType, Unit> function2, boolean z) {
            C47740tvn c47740tvn = new C47740tvn();
            c47740tvn.OLrzqt = function1;
            c47740tvn.copydefault = function2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("test_mode", z);
            c47740tvn.setArguments(bundle);
            return c47740tvn;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.KWHzl = tNT.KWHzl(layoutInflater, viewGroup, false);
        ConstraintLayout root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
        EZpvd();
        view.post(new java.lang.Runnable() { // from class: o.tvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47740tvn.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final void copydefault(C47740tvn c47740tvn) {
        if (c47740tvn.AEQbTJ) {
            return;
        }
        c47740tvn.AEQbTJ = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c47740tvn, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    private final void AYXKKw() {
        android.os.Bundle arguments = getArguments();
        TaskDescription taskDescription = null;
        this.AYXKKw = new TaskDescription(this, new Function1() { // from class: o.tvl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47740tvn.KWHzl(this.copydefault, (tWX) obj);
            }
        }, arguments != null ? arguments.getBoolean("test_mode", false) : false ? new Function1() { // from class: o.tvo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47740tvn.EZpvd(this.KWHzl, (tWX) obj);
            }
        } : null);
        RecyclerView recyclerView = AEQbTJ().KWHzl;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 4);
        gridLayoutManager.setSpanSizeLookup(new Activity());
        recyclerView.setLayoutManager(gridLayoutManager);
        TaskDescription taskDescription2 = this.AYXKKw;
        if (taskDescription2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            taskDescription = taskDescription2;
        }
        recyclerView.setAdapter(taskDescription);
    }

    public static final Unit KWHzl(C47740tvn c47740tvn, tWX twx) {
        Intrinsics.checkNotNullParameter(twx, "");
        pUU.EZpvd("PluginListFragment", "Plugin selected: " + twx.EZpvd().getValue());
        Function1<? super tWX, Unit> function1 = c47740tvn.OLrzqt;
        if (function1 != null) {
            function1.invoke(twx);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C47740tvn c47740tvn, tWX twx) {
        Intrinsics.checkNotNullParameter(twx, "");
        c47740tvn.AEQbTJ(twx);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        try {
            android.os.Bundle arguments = getArguments();
            boolean z = arguments != null ? arguments.getBoolean("test_mode", false) : false;
            java.util.List<tWX> listEZpvd = copydefault().EZpvd(z);
            pUU.EZpvd("PluginListFragment", "Loaded " + listEZpvd.size() + " plugins (testMode: " + z + ")");
            TaskDescription taskDescription = this.AYXKKw;
            if (taskDescription == null) {
                Intrinsics.gEmmrt("");
                taskDescription = null;
            }
            taskDescription.copydefault(listEZpvd);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PluginListFragment", "Failed to load plugins", e);
        }
    }

    public final void AEQbTJ(final tWX twx) {
        final android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle("Test Plugin with JSON");
        viewOnClickListenerC54939xaY.EZpvd("Enter JSON metadata for " + twx.EZpvd(contextRequireContext) + ":");
        final android.widget.EditText editText = new android.widget.EditText(contextRequireContext);
        editText.setHint("Enter mock JSON...");
        viewOnClickListenerC54939xaY.EZpvd(editText);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) "Generate", new View.OnClickListener() { // from class: o.tvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47740tvn.OLrzqt(editText, twx, this, contextRequireContext, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ("Cancel", new View.OnClickListener() { // from class: o.tvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C47740tvn.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(android.widget.EditText editText, tWX twx, C47740tvn c47740tvn, android.content.Context context, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) editText.getText().toString()).toString();
        if (string.length() > 0) {
            try {
                PlanetPublisherPluginType planetPublisherPluginTypeEZpvd = twx.EZpvd();
                java.lang.Object objKWHzl = c47740tvn.copydefault().KWHzl(context, planetPublisherPluginTypeEZpvd, string, PlanetPublisherPluginPreviewType.PUBLISHER);
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                if (thM7380exceptionOrNullimpl == null) {
                    tWV twv = (tWV) objKWHzl;
                    pUU.EZpvd("PluginListFragment", "Successfully generated plugin view with JSON: " + string);
                    Function2<? super tWV, ? super PlanetPublisherPluginType, Unit> function2 = c47740tvn.copydefault;
                    if (function2 != null) {
                        function2.invoke(twv, planetPublisherPluginTypeEZpvd);
                    }
                } else {
                    pUU.valueOf("PluginListFragment", "Failed to generate plugin view with JSON: " + string + ", error: " + thM7380exceptionOrNullimpl.getMessage());
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("PluginListFragment", "Error generating plugin view with JSON: " + string, e);
            }
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.tvn$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final class TaskDescription extends RecyclerView.Adapter<Application> {
        public java.util.List<? extends tWX> AEQbTJ;
        public final Function1<tWX, Unit> EZpvd;
        public final Function1<tWX, Unit> KWHzl;
        public final /* synthetic */ C47740tvn copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.tWX, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.tWX, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull C47740tvn c47740tvn, Function1<? super tWX, Unit> function1, Function1<? super tWX, Unit> function12) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = c47740tvn;
            this.KWHzl = function1;
            this.EZpvd = function12;
            this.AEQbTJ = yDY.AhwBna();
        }

        public final void copydefault(@NotNull java.util.List<? extends tWX> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
            notifyDataSetChanged();
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C47501trL.Application.UrRBLY, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new Application(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(application, "");
            application.copydefault(this.AEQbTJ.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }

        /* JADX INFO: renamed from: o.tvn$TaskDescription$Application */
        public final class Application extends RecyclerView.ViewHolder {
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.copydefault = taskDescription;
            }

            public final void copydefault(@NotNull final tWX twx) {
                Intrinsics.checkNotNullParameter(twx, "");
                android.content.Context context = this.itemView.getContext();
                android.widget.TextView textView = (android.widget.TextView) this.itemView.findViewById(C47501trL.TaskDescription.DwQSDd);
                Intrinsics.copydefault(context);
                textView.setText(twx.EZpvd(context));
                android.widget.ImageView imageView = (android.widget.ImageView) this.itemView.findViewById(C47501trL.TaskDescription.getAdvertisingId);
                android.graphics.drawable.Drawable drawableKWHzl = twx.KWHzl(context);
                if (drawableKWHzl != null) {
                    imageView.setImageDrawable(drawableKWHzl);
                } else {
                    imageView.setImageResource(C52761wXj.TaskDescription.RKcVTr);
                }
                android.view.View view = this.itemView;
                final TaskDescription taskDescription = this.copydefault;
                view.setOnClickListener(new View.OnClickListener() { // from class: o.tvy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C47740tvn.TaskDescription.Application.EZpvd(twx, taskDescription, view2);
                    }
                });
                final Function1 function1 = this.copydefault.EZpvd;
                if (function1 != null) {
                    this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.tvv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(android.view.View view2) {
                            return C47740tvn.TaskDescription.Application.AEQbTJ(function1, twx, view2);
                        }
                    });
                }
            }

            public static final void EZpvd(final tWX twx, TaskDescription taskDescription, android.view.View view) {
                java.lang.String lowerCase = twx.EZpvd().getValue().toLowerCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (!C59449zhJ.startsWith$default(lowerCase, QPLConstants.ENV_DEBUG, false, 2, null)) {
                    C32866mlf.onEvent$default("Feeds_Btm_PluginType_Click", (TrackChannel[]) null, new Function1() { // from class: o.tvq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C47740tvn.TaskDescription.Application.EZpvd(twx, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
                taskDescription.KWHzl.invoke(twx);
            }

            public static final Unit EZpvd(tWX twx, EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "plugin_type", C47727tva.EZpvd.copydefault(twx.EZpvd()), false, 4, null);
                return Unit.INSTANCE;
            }

            public static final boolean AEQbTJ(Function1 function1, tWX twx, android.view.View view) {
                function1.invoke(twx);
                return true;
            }
        }
    }
}
