/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class TopologySummary implements TBase<TopologySummary, TopologySummary._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("TopologySummary");

  private static final TField ID_FIELD_DESC = new TField("id", TType.STRING, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);
  private static final TField NUM_TASKS_FIELD_DESC = new TField("num_tasks", TType.I32, (short)3);
  private static final TField NUM_WORKERS_FIELD_DESC = new TField("num_workers", TType.I32, (short)4);
  private static final TField UPTIME_SECS_FIELD_DESC = new TField("uptime_secs", TType.I32, (short)5);

  private String id;
  private String name;
  private int num_tasks;
  private int num_workers;
  private int uptime_secs;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    NUM_TASKS((short)3, "num_tasks"),
    NUM_WORKERS((short)4, "num_workers"),
    UPTIME_SECS((short)5, "uptime_secs");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // NUM_TASKS
          return NUM_TASKS;
        case 4: // NUM_WORKERS
          return NUM_WORKERS;
        case 5: // UPTIME_SECS
          return UPTIME_SECS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUM_TASKS_ISSET_ID = 0;
  private static final int __NUM_WORKERS_ISSET_ID = 1;
  private static final int __UPTIME_SECS_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new FieldMetaData("id", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NUM_TASKS, new FieldMetaData("num_tasks", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.NUM_WORKERS, new FieldMetaData("num_workers", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.UPTIME_SECS, new FieldMetaData("uptime_secs", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(TopologySummary.class, metaDataMap);
  }

  public TopologySummary() {
  }

  public TopologySummary(
    String id,
    String name,
    int num_tasks,
    int num_workers,
    int uptime_secs)
  {
    this();
    this.id = id;
    this.name = name;
    this.num_tasks = num_tasks;
    set_num_tasks_isSet(true);
    this.num_workers = num_workers;
    set_num_workers_isSet(true);
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopologySummary(TopologySummary other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.is_set_id()) {
      this.id = other.id;
    }
    if (other.is_set_name()) {
      this.name = other.name;
    }
    this.num_tasks = other.num_tasks;
    this.num_workers = other.num_workers;
    this.uptime_secs = other.uptime_secs;
  }

  public TopologySummary deepCopy() {
    return new TopologySummary(this);
  }

  @Deprecated
  public TopologySummary clone() {
    return new TopologySummary(this);
  }

  public String get_id() {
    return this.id;
  }

  public void set_id(String id) {
    this.id = id;
  }

  public void unset_id() {
    this.id = null;
  }

  /** Returns true if field id is set (has been asigned a value) and false otherwise */
  public boolean is_set_id() {
    return this.id != null;
  }

  public void set_id_isSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public String get_name() {
    return this.name;
  }

  public void set_name(String name) {
    this.name = name;
  }

  public void unset_name() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean is_set_name() {
    return this.name != null;
  }

  public void set_name_isSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int get_num_tasks() {
    return this.num_tasks;
  }

  public void set_num_tasks(int num_tasks) {
    this.num_tasks = num_tasks;
    set_num_tasks_isSet(true);
  }

  public void unset_num_tasks() {
    __isset_bit_vector.clear(__NUM_TASKS_ISSET_ID);
  }

  /** Returns true if field num_tasks is set (has been asigned a value) and false otherwise */
  public boolean is_set_num_tasks() {
    return __isset_bit_vector.get(__NUM_TASKS_ISSET_ID);
  }

  public void set_num_tasks_isSet(boolean value) {
    __isset_bit_vector.set(__NUM_TASKS_ISSET_ID, value);
  }

  public int get_num_workers() {
    return this.num_workers;
  }

  public void set_num_workers(int num_workers) {
    this.num_workers = num_workers;
    set_num_workers_isSet(true);
  }

  public void unset_num_workers() {
    __isset_bit_vector.clear(__NUM_WORKERS_ISSET_ID);
  }

  /** Returns true if field num_workers is set (has been asigned a value) and false otherwise */
  public boolean is_set_num_workers() {
    return __isset_bit_vector.get(__NUM_WORKERS_ISSET_ID);
  }

  public void set_num_workers_isSet(boolean value) {
    __isset_bit_vector.set(__NUM_WORKERS_ISSET_ID, value);
  }

  public int get_uptime_secs() {
    return this.uptime_secs;
  }

  public void set_uptime_secs(int uptime_secs) {
    this.uptime_secs = uptime_secs;
    set_uptime_secs_isSet(true);
  }

  public void unset_uptime_secs() {
    __isset_bit_vector.clear(__UPTIME_SECS_ISSET_ID);
  }

  /** Returns true if field uptime_secs is set (has been asigned a value) and false otherwise */
  public boolean is_set_uptime_secs() {
    return __isset_bit_vector.get(__UPTIME_SECS_ISSET_ID);
  }

  public void set_uptime_secs_isSet(boolean value) {
    __isset_bit_vector.set(__UPTIME_SECS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unset_id();
      } else {
        set_id((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unset_name();
      } else {
        set_name((String)value);
      }
      break;

    case NUM_TASKS:
      if (value == null) {
        unset_num_tasks();
      } else {
        set_num_tasks((Integer)value);
      }
      break;

    case NUM_WORKERS:
      if (value == null) {
        unset_num_workers();
      } else {
        set_num_workers((Integer)value);
      }
      break;

    case UPTIME_SECS:
      if (value == null) {
        unset_uptime_secs();
      } else {
        set_uptime_secs((Integer)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return get_id();

    case NAME:
      return get_name();

    case NUM_TASKS:
      return new Integer(get_num_tasks());

    case NUM_WORKERS:
      return new Integer(get_num_workers());

    case UPTIME_SECS:
      return new Integer(get_uptime_secs());

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case ID:
      return is_set_id();
    case NAME:
      return is_set_name();
    case NUM_TASKS:
      return is_set_num_tasks();
    case NUM_WORKERS:
      return is_set_num_workers();
    case UPTIME_SECS:
      return is_set_uptime_secs();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopologySummary)
      return this.equals((TopologySummary)that);
    return false;
  }

  public boolean equals(TopologySummary that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.is_set_id();
    boolean that_present_id = true && that.is_set_id();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_name = true && this.is_set_name();
    boolean that_present_name = true && that.is_set_name();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_num_tasks = true;
    boolean that_present_num_tasks = true;
    if (this_present_num_tasks || that_present_num_tasks) {
      if (!(this_present_num_tasks && that_present_num_tasks))
        return false;
      if (this.num_tasks != that.num_tasks)
        return false;
    }

    boolean this_present_num_workers = true;
    boolean that_present_num_workers = true;
    if (this_present_num_workers || that_present_num_workers) {
      if (!(this_present_num_workers && that_present_num_workers))
        return false;
      if (this.num_workers != that.num_workers)
        return false;
    }

    boolean this_present_uptime_secs = true;
    boolean that_present_uptime_secs = true;
    if (this_present_uptime_secs || that_present_uptime_secs) {
      if (!(this_present_uptime_secs && that_present_uptime_secs))
        return false;
      if (this.uptime_secs != that.uptime_secs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_id = true && (is_set_id());
    builder.append(present_id);
    if (present_id)
      builder.append(id);

    boolean present_name = true && (is_set_name());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_num_tasks = true;
    builder.append(present_num_tasks);
    if (present_num_tasks)
      builder.append(num_tasks);

    boolean present_num_workers = true;
    builder.append(present_num_workers);
    if (present_num_workers)
      builder.append(num_workers);

    boolean present_uptime_secs = true;
    builder.append(present_uptime_secs);
    if (present_uptime_secs)
      builder.append(uptime_secs);

    return builder.toHashCode();
  }

  public int compareTo(TopologySummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TopologySummary typedOther = (TopologySummary)other;

    lastComparison = Boolean.valueOf(is_set_id()).compareTo(typedOther.is_set_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_id()) {      lastComparison = TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_name()).compareTo(typedOther.is_set_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_name()) {      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_num_tasks()).compareTo(typedOther.is_set_num_tasks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_num_tasks()) {      lastComparison = TBaseHelper.compareTo(this.num_tasks, typedOther.num_tasks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_num_workers()).compareTo(typedOther.is_set_num_workers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_num_workers()) {      lastComparison = TBaseHelper.compareTo(this.num_workers, typedOther.num_workers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_uptime_secs()).compareTo(typedOther.is_set_uptime_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_uptime_secs()) {      lastComparison = TBaseHelper.compareTo(this.uptime_secs, typedOther.uptime_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ID
          if (field.type == TType.STRING) {
            this.id = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // NUM_TASKS
          if (field.type == TType.I32) {
            this.num_tasks = iprot.readI32();
            set_num_tasks_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // NUM_WORKERS
          if (field.type == TType.I32) {
            this.num_workers = iprot.readI32();
            set_num_workers_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // UPTIME_SECS
          if (field.type == TType.I32) {
            this.uptime_secs = iprot.readI32();
            set_uptime_secs_isSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.id != null) {
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeString(this.id);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(NUM_TASKS_FIELD_DESC);
    oprot.writeI32(this.num_tasks);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NUM_WORKERS_FIELD_DESC);
    oprot.writeI32(this.num_workers);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(UPTIME_SECS_FIELD_DESC);
    oprot.writeI32(this.uptime_secs);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TopologySummary(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_tasks:");
    sb.append(this.num_tasks);
    first = false;
    if (!first) sb.append(", ");
    sb.append("num_workers:");
    sb.append(this.num_workers);
    first = false;
    if (!first) sb.append(", ");
    sb.append("uptime_secs:");
    sb.append(this.uptime_secs);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!is_set_id()) {
      throw new TProtocolException("Required field 'id' is unset! Struct:" + toString());
    }

    if (!is_set_name()) {
      throw new TProtocolException("Required field 'name' is unset! Struct:" + toString());
    }

    if (!is_set_num_tasks()) {
      throw new TProtocolException("Required field 'num_tasks' is unset! Struct:" + toString());
    }

    if (!is_set_num_workers()) {
      throw new TProtocolException("Required field 'num_workers' is unset! Struct:" + toString());
    }

    if (!is_set_uptime_secs()) {
      throw new TProtocolException("Required field 'uptime_secs' is unset! Struct:" + toString());
    }

  }

}

