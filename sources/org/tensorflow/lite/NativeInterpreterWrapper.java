package org.tensorflow.lite;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterImpl;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes13.dex */
public class NativeInterpreterWrapper implements AutoCloseable {
    private static final int ERROR_BUFFER_SIZE = 512;
    private static final RuntimeFlavor RUNTIME_FLAVOR = RuntimeFlavor.APPLICATION;
    private long cancellationFlagHandle;
    private final List<Delegate> delegates;
    long errorHandle;
    private long inferenceDurationNanoseconds;
    private TensorImpl[] inputTensors;
    private Map<String, Integer> inputsIndexes;
    long interpreterHandle;
    private boolean isMemoryAllocated;
    private ByteBuffer modelByteBuffer;
    private long modelHandle;
    private boolean originalGraphHasUnresolvedFlexOp;
    private TensorImpl[] outputTensors;
    private Map<String, Integer> outputsIndexes;
    private final List<Delegate> ownedDelegates;
    private Map<String, NativeSignatureRunnerWrapper> signatureRunnerMap;

    public static native long allocateTensors(long j, long j2);

    public static native void allowBufferHandleOutput(long j, boolean z);

    public static native void allowFp16PrecisionForFp32(long j, boolean z);

    public static native long createCancellationFlag(long j);

    public static native long createErrorReporter(int i);

    public static native long createInterpreter(long j, long j2, int i, boolean z, List<Long> list);

    public static native long createModel(String str, long j);

    public static native long createModelWithBuffer(ByteBuffer byteBuffer, long j);

    public static native void delete(long j, long j2, long j3);

    public static native long deleteCancellationFlag(long j);

    public static native int getExecutionPlanLength(long j);

    public static native int getInputCount(long j);

    public static native String[] getInputNames(long j);

    public static native int getInputTensorIndex(long j, int i);

    public static native int getOutputCount(long j);

    public static native String[] getOutputNames(long j);

    public static native int getOutputTensorIndex(long j, int i);

    public static native String[] getSignatureKeys(long j);

    public static native boolean hasUnresolvedFlexOp(long j);

    public static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    public static native void run(long j, long j2);

    public static native void setCancelled(long j, long j2, boolean z);

    public NativeInterpreterWrapper(String str) {
        this(str, (InterpreterImpl.Options) null);
    }

    public NativeInterpreterWrapper(ByteBuffer byteBuffer) {
        this(byteBuffer, (InterpreterImpl.Options) null);
    }

    public NativeInterpreterWrapper(String str, InterpreterImpl.Options options) {
        this.cancellationFlagHandle = 0L;
        this.inferenceDurationNanoseconds = -1L;
        this.isMemoryAllocated = false;
        this.originalGraphHasUnresolvedFlexOp = false;
        this.delegates = new ArrayList();
        this.ownedDelegates = new ArrayList();
        TensorFlowLite.init();
        long jCreateErrorReporter = createErrorReporter(512);
        init(jCreateErrorReporter, createModel(str, jCreateErrorReporter), options);
    }

    public NativeInterpreterWrapper(ByteBuffer byteBuffer, InterpreterImpl.Options options) {
        this.cancellationFlagHandle = 0L;
        this.inferenceDurationNanoseconds = -1L;
        this.isMemoryAllocated = false;
        this.originalGraphHasUnresolvedFlexOp = false;
        this.delegates = new ArrayList();
        this.ownedDelegates = new ArrayList();
        TensorFlowLite.init();
        if (byteBuffer == null || (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.modelByteBuffer = byteBuffer;
        long jCreateErrorReporter = createErrorReporter(512);
        init(jCreateErrorReporter, createModelWithBuffer(this.modelByteBuffer, jCreateErrorReporter), options);
    }

    private void init(long j, long j2, InterpreterImpl.Options options) {
        if (options == null) {
            options = new InterpreterImpl.Options();
        }
        if (options.getAccelerationConfig() != null) {
            options.getAccelerationConfig().apply(options);
        }
        this.errorHandle = j;
        this.modelHandle = j2;
        ArrayList arrayList = new ArrayList();
        long jCreateInterpreter = createInterpreter(j2, j, options.getNumThreads(), options.getUseXNNPACK(), arrayList);
        this.interpreterHandle = jCreateInterpreter;
        this.originalGraphHasUnresolvedFlexOp = hasUnresolvedFlexOp(jCreateInterpreter);
        addDelegates(options);
        initDelegatesWithInterpreterFactory();
        arrayList.ensureCapacity(this.delegates.size());
        Iterator<Delegate> it = this.delegates.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getNativeHandle()));
        }
        if (!arrayList.isEmpty()) {
            delete(0L, 0L, this.interpreterHandle);
            this.interpreterHandle = createInterpreter(j2, j, options.getNumThreads(), options.getUseXNNPACK(), arrayList);
        }
        Boolean bool = options.allowFp16PrecisionForFp32;
        if (bool != null) {
            allowFp16PrecisionForFp32(this.interpreterHandle, bool.booleanValue());
        }
        Boolean bool2 = options.allowBufferHandleOutput;
        if (bool2 != null) {
            allowBufferHandleOutput(this.interpreterHandle, bool2.booleanValue());
        }
        if (options.isCancellable()) {
            this.cancellationFlagHandle = createCancellationFlag(this.interpreterHandle);
        }
        this.inputTensors = new TensorImpl[getInputCount(this.interpreterHandle)];
        this.outputTensors = new TensorImpl[getOutputCount(this.interpreterHandle)];
        Boolean bool3 = options.allowFp16PrecisionForFp32;
        if (bool3 != null) {
            allowFp16PrecisionForFp32(this.interpreterHandle, bool3.booleanValue());
        }
        Boolean bool4 = options.allowBufferHandleOutput;
        if (bool4 != null) {
            allowBufferHandleOutput(this.interpreterHandle, bool4.booleanValue());
        }
        allocateTensors(this.interpreterHandle, j);
        this.isMemoryAllocated = true;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.inputTensors;
            if (i >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.close();
                this.inputTensors[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.outputTensors;
            if (i2 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i2];
            if (tensorImpl2 != null) {
                tensorImpl2.close();
                this.outputTensors[i2] = null;
            }
            i2++;
        }
        this.delegates.clear();
        Iterator<Delegate> it = this.ownedDelegates.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.ownedDelegates.clear();
        delete(this.errorHandle, this.modelHandle, this.interpreterHandle);
        deleteCancellationFlag(this.cancellationFlagHandle);
        this.errorHandle = 0L;
        this.modelHandle = 0L;
        this.interpreterHandle = 0L;
        this.cancellationFlagHandle = 0L;
        this.modelByteBuffer = null;
        this.inputsIndexes = null;
        this.outputsIndexes = null;
        this.isMemoryAllocated = false;
    }

    public void runSignature(Map<String, Object> map, Map<String, Object> map2, String str) {
        this.inferenceDurationNanoseconds = -1L;
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str);
        if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
            Object[] objArr = new Object[map.size()];
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                objArr[signatureRunnerWrapper.getInputIndex(entry.getKey())] = entry.getValue();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                int outputIndex = signatureRunnerWrapper.getOutputIndex(entry2.getKey());
                treeMap.put(Integer.valueOf(outputIndex), entry2.getValue());
            }
            run(objArr, treeMap);
            return;
        }
        for (Map.Entry<String, Object> entry3 : map.entrySet()) {
            int[] inputShapeIfDifferent = getInputTensor(entry3.getKey(), str).getInputShapeIfDifferent(entry3.getValue());
            if (inputShapeIfDifferent != null) {
                try {
                    signatureRunnerWrapper.resizeInput(entry3.getKey(), inputShapeIfDifferent);
                } catch (IllegalArgumentException e) {
                    throw ((IllegalArgumentException) new IllegalArgumentException(String.format("Tensor passed for input '%s' of signature '%s' has different shape than expected", entry3.getKey(), str)).initCause(e));
                }
            }
        }
        signatureRunnerWrapper.allocateTensorsIfNeeded();
        for (Map.Entry<String, Object> entry4 : map.entrySet()) {
            signatureRunnerWrapper.getInputTensor(entry4.getKey()).setTo(entry4.getValue());
        }
        long jNanoTime = System.nanoTime();
        signatureRunnerWrapper.invoke();
        long jNanoTime2 = System.nanoTime();
        for (Map.Entry<String, Object> entry5 : map2.entrySet()) {
            if (entry5.getValue() != null) {
                signatureRunnerWrapper.getOutputTensor(entry5.getKey()).copyTo(entry5.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2 - jNanoTime;
    }

    public void run(Object[] objArr, Map<Integer, Object> map) {
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        for (int i = 0; i < objArr.length; i++) {
            int[] inputShapeIfDifferent = getInputTensor(i).getInputShapeIfDifferent(objArr[i]);
            if (inputShapeIfDifferent != null) {
                resizeInput(i, inputShapeIfDifferent);
            }
        }
        boolean zAllocateTensorsIfNeeded = allocateTensorsIfNeeded();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            getInputTensor(i2).setTo(objArr[i2]);
        }
        long jNanoTime = System.nanoTime();
        run(this.interpreterHandle, this.errorHandle);
        long jNanoTime2 = System.nanoTime();
        if (zAllocateTensorsIfNeeded) {
            for (TensorImpl tensorImpl : this.outputTensors) {
                if (tensorImpl != null) {
                    tensorImpl.refreshShape();
                }
            }
        }
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                getOutputTensor(entry.getKey().intValue()).copyTo(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2 - jNanoTime;
    }

    public void resizeInput(int i, int[] iArr) {
        resizeInput(i, iArr, false);
    }

    public void resizeInput(int i, int[] iArr, boolean z) {
        if (resizeInput(this.interpreterHandle, this.errorHandle, i, iArr, z)) {
            this.isMemoryAllocated = false;
            TensorImpl tensorImpl = this.inputTensors[i];
            if (tensorImpl != null) {
                tensorImpl.refreshShape();
            }
        }
    }

    public void allocateTensors() {
        allocateTensorsIfNeeded();
    }

    private boolean allocateTensorsIfNeeded() {
        if (this.isMemoryAllocated) {
            return false;
        }
        this.isMemoryAllocated = true;
        allocateTensors(this.interpreterHandle, this.errorHandle);
        for (TensorImpl tensorImpl : this.outputTensors) {
            if (tensorImpl != null) {
                tensorImpl.refreshShape();
            }
        }
        return true;
    }

    public int getInputIndex(String str) {
        if (this.inputsIndexes == null) {
            String[] inputNames = getInputNames(this.interpreterHandle);
            this.inputsIndexes = new HashMap();
            if (inputNames != null) {
                for (int i = 0; i < inputNames.length; i++) {
                    this.inputsIndexes.put(inputNames[i], Integer.valueOf(i));
                }
            }
        }
        if (this.inputsIndexes.containsKey(str)) {
            return this.inputsIndexes.get(str).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", str, this.inputsIndexes));
    }

    public int getOutputIndex(String str) {
        if (this.outputsIndexes == null) {
            String[] outputNames = getOutputNames(this.interpreterHandle);
            this.outputsIndexes = new HashMap();
            if (outputNames != null) {
                for (int i = 0; i < outputNames.length; i++) {
                    this.outputsIndexes.put(outputNames[i], Integer.valueOf(i));
                }
            }
        }
        if (this.outputsIndexes.containsKey(str)) {
            return this.outputsIndexes.get(str).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", str, this.outputsIndexes));
    }

    public Long getLastNativeInferenceDurationNanoseconds() {
        long j = this.inferenceDurationNanoseconds;
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public int getInputTensorCount() {
        return this.inputTensors.length;
    }

    public TensorImpl getInputTensor(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.inputTensors;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.interpreterHandle;
                TensorImpl tensorImplFromIndex = TensorImpl.fromIndex(j, getInputTensorIndex(j, i));
                tensorImplArr[i] = tensorImplFromIndex;
                return tensorImplFromIndex;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i);
    }

    public TensorImpl getInputTensor(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid input tensor name provided (null)");
        }
        NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str2);
        if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
            return getInputTensor(signatureRunnerWrapper.getInputIndex(str));
        }
        return signatureRunnerWrapper.getInputTensor(str);
    }

    public String[] getSignatureKeys() {
        return getSignatureKeys(this.interpreterHandle);
    }

    public String[] getSignatureInputs(String str) {
        return getSignatureRunnerWrapper(str).inputNames();
    }

    public String[] getSignatureOutputs(String str) {
        return getSignatureRunnerWrapper(str).outputNames();
    }

    public int getOutputTensorCount() {
        return this.outputTensors.length;
    }

    public TensorImpl getOutputTensor(int i) {
        if (i >= 0) {
            TensorImpl[] tensorImplArr = this.outputTensors;
            if (i < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.interpreterHandle;
                TensorImpl tensorImplFromIndex = TensorImpl.fromIndex(j, getOutputTensorIndex(j, i));
                tensorImplArr[i] = tensorImplFromIndex;
                return tensorImplFromIndex;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i);
    }

    public TensorImpl getOutputTensor(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid output tensor name provided (null)");
        }
        NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str2);
        if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
            return getOutputTensor(signatureRunnerWrapper.getOutputIndex(str));
        }
        return signatureRunnerWrapper.getOutputTensor(str);
    }

    public int getExecutionPlanLength() {
        return getExecutionPlanLength(this.interpreterHandle);
    }

    public void setCancelled(boolean z) {
        long j = this.cancellationFlagHandle;
        if (j == 0) {
            throw new IllegalStateException("Cannot cancel the inference. Have you called InterpreterApi.Options.setCancellable?");
        }
        setCancelled(this.interpreterHandle, j, z);
    }

    private void addDelegates(InterpreterImpl.Options options) {
        Delegate delegateMaybeCreateFlexDelegate;
        if (this.originalGraphHasUnresolvedFlexOp && (delegateMaybeCreateFlexDelegate = maybeCreateFlexDelegate(options.getDelegates())) != null) {
            this.ownedDelegates.add(delegateMaybeCreateFlexDelegate);
            this.delegates.add(delegateMaybeCreateFlexDelegate);
        }
        addUserProvidedDelegates(options);
        Iterator<DelegateFactory> it = options.getDelegateFactories().iterator();
        while (it.hasNext()) {
            Delegate delegateCreate = it.next().create(RUNTIME_FLAVOR);
            this.ownedDelegates.add(delegateCreate);
            this.delegates.add(delegateCreate);
        }
        if (options.getUseNNAPI()) {
            NnApiDelegate nnApiDelegate = new NnApiDelegate();
            this.ownedDelegates.add(nnApiDelegate);
            this.delegates.add(nnApiDelegate);
        }
    }

    private void addUserProvidedDelegates(InterpreterImpl.Options options) {
        for (Delegate delegate : options.getDelegates()) {
            if (options.getRuntime() != InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY && !(delegate instanceof NnApiDelegate)) {
                throw new IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
            this.delegates.add(delegate);
        }
    }

    private void initDelegatesWithInterpreterFactory() {
        InterpreterFactoryImpl interpreterFactoryImpl = new InterpreterFactoryImpl();
        for (Delegate delegate : this.delegates) {
            if (delegate instanceof NnApiDelegate) {
                ((NnApiDelegate) delegate).initWithInterpreterFactoryApi(interpreterFactoryImpl);
            }
        }
    }

    private NativeSignatureRunnerWrapper getSignatureRunnerWrapper(String str) {
        if (this.signatureRunnerMap == null) {
            this.signatureRunnerMap = new HashMap();
        }
        if (!this.signatureRunnerMap.containsKey(str)) {
            this.signatureRunnerMap.put(str, new NativeSignatureRunnerWrapper(this.interpreterHandle, this.errorHandle, str));
        }
        return this.signatureRunnerMap.get(str);
    }

    private static Delegate maybeCreateFlexDelegate(List<Delegate> list) {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator<Delegate> it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance(it.next())) {
                    return null;
                }
            }
            return (Delegate) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }
}
