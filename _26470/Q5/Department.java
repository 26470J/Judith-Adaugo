package Id_26470.Q5;

    public class Department extends Institution {
        private String departmentName;
        private String departmentHead;

        public Department(int id, String createdDate, String updatedDate, String institutionName, String code, String address, String departmentName, String departmentHead) {
            super(id, createdDate, updatedDate, institutionName, code, address);
            this.departmentName = departmentName;
            this.departmentHead = departmentHead;
        }

        public String getDepartmentName() { return departmentName; }
        public void setDepartmentName(String departmentName) throws AttendanceDataException {
            if (departmentName == null || departmentName.trim().isEmpty())
                throw new AttendanceDataException("departmentName cannot be empty");
            this.departmentName = departmentName;
        }

        public String getDepartmentHead() { return departmentHead; }
        public void setDepartmentHead(String departmentHead) throws AttendanceDataException {
            if (departmentHead == null || departmentHead.trim().isEmpty())
                throw new AttendanceDataException("departmentHead cannot be empty");
            this.departmentHead = departmentHead;
        }
    }

