/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.refs;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldValueMetaData;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@ThriftStruct(value="MyField", builder=MyField.Builder.class)
public final class MyField {

    @ThriftConstructor
    public MyField(
        @ThriftField(value=1, name="opt_value", requiredness=Requiredness.OPTIONAL) final Long optValue,
        @ThriftField(value=2, name="value", requiredness=Requiredness.NONE) final long value,
        @ThriftField(value=3, name="req_value", requiredness=Requiredness.REQUIRED) final long reqValue
    ) {
        this.optValue = optValue;
        this.value = value;
        this.reqValue = reqValue;
    }
    
    @ThriftConstructor
    protected MyField() {
      this.optValue = null;
      this.value = 0L;
      this.reqValue = 0L;
    }
    
    public static class Builder {
    
        private Long optValue = null;
        private long value = 0L;
        private long reqValue = 0L;
    
        @ThriftField(value=1, name="opt_value", requiredness=Requiredness.OPTIONAL)
        public Builder setOptValue(Long optValue) {
            this.optValue = optValue;
            return this;
        }
    
        public Long getOptValue() { return optValue; }
    
            @ThriftField(value=2, name="value", requiredness=Requiredness.NONE)
        public Builder setValue(long value) {
            this.value = value;
            return this;
        }
    
        public long getValue() { return value; }
    
            @ThriftField(value=3, name="req_value", requiredness=Requiredness.REQUIRED)
        public Builder setReqValue(long reqValue) {
            this.reqValue = reqValue;
            return this;
        }
    
        public long getReqValue() { return reqValue; }
    
        public Builder() { }
        public Builder(MyField other) {
            this.optValue = other.optValue;
            this.value = other.value;
            this.reqValue = other.reqValue;
        }
    
        @ThriftConstructor
        public MyField build() {
            MyField result = new MyField (
                this.optValue,
                this.value,
                this.reqValue
            );
            return result;
        }
    }
    
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("MyField");
    private final Long optValue;
    public static final int _OPT_VALUE = 1;
    private static final TField OPT_VALUE_FIELD_DESC = new TField("opt_value", TType.I64, (short)1);
        private final long value;
    public static final int _VALUE = 2;
    private static final TField VALUE_FIELD_DESC = new TField("value", TType.I64, (short)2);
        private final long reqValue;
    public static final int _REQ_VALUE = 3;
    private static final TField REQ_VALUE_FIELD_DESC = new TField("req_value", TType.I64, (short)3);
    static {
      NAMES_TO_IDS.put("optValue", 1);
      FIELD_METADATA.put(1, OPT_VALUE_FIELD_DESC);
      NAMES_TO_IDS.put("value", 2);
      FIELD_METADATA.put(2, VALUE_FIELD_DESC);
      NAMES_TO_IDS.put("reqValue", 3);
      FIELD_METADATA.put(3, REQ_VALUE_FIELD_DESC);
    }
    
    @ThriftField(value=1, name="opt_value", requiredness=Requiredness.OPTIONAL)
    public Long getOptValue() { return optValue; }
    
    
    @ThriftField(value=2, name="value", requiredness=Requiredness.NONE)
    public long getValue() { return value; }
    
    
    @ThriftField(value=3, name="req_value", requiredness=Requiredness.REQUIRED)
    public long getReqValue() { return reqValue; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("optValue", optValue);
        helper.add("value", value);
        helper.add("reqValue", reqValue);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        MyField other = (MyField)o;
    
        return
            Objects.equals(optValue, other.optValue) &&
            Objects.equals(value, other.value) &&
            Objects.equals(reqValue, other.reqValue) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            optValue,
            value,
            reqValue
        });
    }
    
    
    public static MyField read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(MyField.NAMES_TO_IDS, MyField.FIELD_METADATA);
      MyField.Builder builder = new MyField.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _OPT_VALUE:
          if (__field.type == TType.I64) {
            Long optValue = oprot.readI64();
            builder.setOptValue(optValue);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _VALUE:
          if (__field.type == TType.I64) {
            long value = oprot.readI64();
            builder.setValue(value);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _REQ_VALUE:
          if (__field.type == TType.I64) {
            long reqValue = oprot.readI64();
            builder.setReqValue(reqValue);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      if (this.optValue != null) {
        oprot.writeFieldBegin(OPT_VALUE_FIELD_DESC);
        oprot.writeI64(this.optValue);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeI64(this.value);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REQ_VALUE_FIELD_DESC);
      oprot.writeI64(this.reqValue);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
