FROM python:3.12

WORKDIR /app

# Copy the virtual environment into the container
COPY venv /app/venv

# Set the PATH environment variable to include the virtual environment's bin directory
ENV PATH="/app/venv/bin:$PATH"

# Copy the application code and requirements.txt into the container
COPY requirements.txt .

# Install dependencies from requirements.txt
RUN pip install -r requirements.txt

# Copy the rest of the application code
COPY . .

# Expose port 8183
EXPOSE 8183

# Set the default command to run your Django application
CMD ["/bin/bash", "-c", "source /app/venv/bin/activate && python manage.py runserver 0.0.0.0:8183"]